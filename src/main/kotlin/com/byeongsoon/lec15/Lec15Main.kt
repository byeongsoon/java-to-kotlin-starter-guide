package com.byeongsoon.lec15

fun main() {

  // 배열 - 프로덕션 코드에서 잘 사용하지 않음(문법만 간략히 소개)
  val array = arrayOf(100, 200)

  for (i in array.indices) {
    println("${i} ${array[i]}")
  }

  for ((idx, value) in array.withIndex()) {
    println("${idx} ${value} ")
  }

  array.plus(300)

  // Collection
  // List
  val numbers = listOf(100, 200)
  // 비어있는 리스트를 만들 때는 타입을 명시적으로 적어주어야 한다.
  val emptyList = emptyList<Int>()
  printNumbers(emptyList())

  // 값 참조할 때
  println(numbers[0])
  for (number in numbers) {
    println(number)
  }

  for ((idx, value) in numbers.withIndex()) {
    println("${idx} ${value} ")
  }

  // 가변으로 만들 땐
  // TIP : 우선은 불변 리스트를 만들고, 꼭 필요한 경우에만 가변 리스트로 수정하자.
  val numbers2 = mutableListOf(100, 200)
  numbers2.add(300)

  // Set
  val numbers3 = setOf(100, 200)

  for (number in numbers3) {
    println(number)
  }

  for ((idx, value) in numbers3.withIndex()) {
    println("${idx} ${value}")
  }

  val numbers4 = mutableSetOf(100, 200)
  numbers4.add(300)

  // Map
  val oldMap = mutableMapOf<Int, String>()
  oldMap.put(1, "MONDAY")
  oldMap[2] = "TUESDAY"

  mapOf(1 to "MONDAY", 2 to "TUESDAY")

  for (key in oldMap.keys) {
    println(key)
    println(oldMap[key])
  }

  for ((key, value) in oldMap.entries) {
    println(key)
    println(value)
  }

  // 컬렉션의 null 가능성, 자바와 함께 사용하기
  // List<Int?> / List<Int>? / List<Int?>?
  // 자바는 읽기 전용과 변경 가능 컬렉션을 구분하지 않는다.
  // nullable 도 자바는 구분하지 않는다.

}

// 타입 추론이 가능하면 타입 생략 가능
private fun printNumbers(number: List<Int>) {

}

