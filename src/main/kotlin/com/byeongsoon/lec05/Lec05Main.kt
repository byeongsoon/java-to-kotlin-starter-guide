package com.byeongsoon.lec05

// if문 사용은 자바와 똑같다.
fun validateScoreIsNotNegative(score: Int) {
  if (score < 0) {
    throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
  }
}

// 범위를 위해 in과 .. 을 사용한다.
fun validateScoreIsNotNegative2(score: Int) {
  if (score !in 0..100) {
    throw IllegalArgumentException("${score}의 범위는 0부터 100까지 입니다.")
  }
}

// else가 포함된 조건문
// 자바는 Statement / 코틀린은 Expression
fun getPassOrFail(score: Int): String {
  return if (score >= 50) {
    "P"
  } else {
    "F"
  }
}

// switch 대신 when 문을 사용한다.
fun getGradeWithSwitch(score: Int): String {
  return when (score / 10) {
    9 -> "A"
    8 -> "B"
    7 -> "C"
    else -> "D"
  }
}

fun getGradeWithSwitch2(score: Int): String {
  return when (score) {
    in 90..99 -> "A"
    in 80..90-> "B"
    in 70..79 -> "C"
    else -> "D"
  }
}

fun startsWithA(obj: Any): Boolean {
  return when(obj) {
    is String -> obj.startsWith("A")
    else -> false
  }
}

fun judgeNumber(number: Int) {
  when(number) {
    1, 0, -1 -> println("어디서 많이 본 숫자입니다.")
    else -> println("1, 0, -1이 아닙니다.")
  }
}

fun judgeNumber2(number: Int) {
  when {
    number == 0 -> println("주어진 숫자는 0입니다.")
    number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
    else -> println("주어진 숫자는 홀수입니다.")
  }
}