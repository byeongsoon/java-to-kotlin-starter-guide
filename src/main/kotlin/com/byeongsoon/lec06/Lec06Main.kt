package com.byeongsoon.lec06

fun main() {
  // for-each 문(향상된 for 문)
  val numbers = listOf(1L, 2L, 3L)
  for (number in numbers) {
    println(number)
  }

  // 전통적인 for 문
  for (i in 1..3) {
    println(i)
  }
  // 내려가는 경우
  for (i in 3 downTo 1) {
    println(i)
  }
  // 2칸씩 올라가는 경우
  for (i in 1..5 step 2) {
    println(i)
  }

  // while 문
  var i = 1
  while (i <= 3) {
    println(i)
    i++
  }

}