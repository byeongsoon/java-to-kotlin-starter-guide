package com.byeongsoon.lec19;

import kotlin.random.Random


// data class는 ComponentN 함수를 자동으로 구현
data class Person(
  val name: String,
  val age: Int,
)

class Person2(
  val name: String,
  val age: Int,
) {
  operator fun component1(): String = this.name
  operator fun component2(): Int {
    return this.age
  }

}

fun main() {

  val person = Person("장병순", 30)
  val (name, age) = person;
  // componentN
//  val name = person.component1()
//  val age = person.component2()
  println("이름은 ${name}, 나이는 ${age} 입니다.")


  val numbers = listOf(1,2,3)
  // forEach에서는 continue, break를 사용할 수 없다.
  numbers.map { number -> number + 1 }
    .forEach { number -> println(number) }
  for (number in numbers) {
    println(number)
  }
  // 하지만 함께 쓰고싶다면 / @run : break, @forEach : continue 와 같은 효과
  run {
    numbers.map { number -> number + 1 }
      .forEach { number ->
        if ( number == 2) {
          return@run  // OR return@forEach
        }
      }
  }

  // Label
  // 특정 라벨을 라벨링 함으로써 특정 라벨에 대해서 명령을 전달할 수 있다 -> 라벨을 이용한 점프는 절대로 사용하지마라..!
  abc@ for (i in 1..100) {
    for (j in 1..100) {
      if (j == 2) {
        break@abc
      }
      println("${i} ${j}")
    }
  }

  // TakeIf, TakeUnless
  val number: Int = Random.nextInt()
  fun getNumberOrNull(): Int? {
    return if (number <= 0) {
      null
    } else {
      number
    }
  }
  // TakeIf : 주어진 조건을 만족하면 그 값, 그렇지 않으면 null 반환
  fun getNumberOrNum2(): Int? {
    return number.takeIf { it > 0 }
  }
  // TakeUnless : 주어진 조건을 만족하지 않으면 그 값을, 만족하면 null을 반환
  fun getNumberOrNum3(): Int? {
    return number.takeUnless { it <= 0 }
  }

}