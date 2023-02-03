package com.byeongsoon.lec03

import com.lannstark.lec03.Person

fun main() {

  val numebr1 = 3
  // 코틀린에서 타입 변환은 to변환타입()이 필요하다.
  val number2: Long = numebr1.toLong()

  val number3: Int?  = 3
  // nullable 한 변수를 타입 변환하려면 safe call과 Elvis 연산자를 사용한다.
  val number4: Long = number3?.toLong() ?: 0L

  // String interpolation / String indexing
  val person = Person("장병순", 30)
  println("이름 : ${person.name}, 나이 : ${person.age}")

  val str = """
    ABC
    EFG
    ${person.name}
  """.trimIndent()
  println(str)

  val str1 = "ABC"
  println(str1[0])
  println(str1[2])



}

fun printAgeIfPerson(obj: Any) {
  if (obj is Person) {
    val person = obj as Person
    // as Person 은 생략 가능 -> 스마트 캐스트
//    val person = obj
    println(person.age)
  }

  if (obj !is Person) {
    val person = obj as Person
    println(person.age)
  }
}

fun printAgeIfPerson2(obj: Any?) {
  val person = obj as? Person
  println(person?.age)
}
