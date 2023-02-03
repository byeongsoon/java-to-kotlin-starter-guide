package com.byeongsoon

import com.byeongsoon.lec04.Money
import com.lannstark.lec04.JavaMoney

fun main() {

  val money1 = JavaMoney(2_000L)
  val money2 = JavaMoney(1_000L)

  // 자바와 다르게 객체 간의 비교연산자 사용가능
  // 자동으로 compareTo 호출
  if (money1 > money2) {
    println("Money1이 Money2보다 금액이 큽니다.")
  }

  val money3 = JavaMoney(1_000L)
  val money4 = money3
  val money5 = JavaMoney(1_000L)

  // 자바에서는 동일 비교에 == / 동등 비교에 .equals()를 사용
  // 코틀린에서는 동일 비교에 === / 동등 비교에 == 사용
  println(money3 === money4)
  println(money3 == money5)

  // 코틀린도 자바처럼 Lazy 연산 수행
  if (fun1() || fun2()) {
    println("본문")
  }

  // 연산자 오버로딩 사용 -> Money.kt 사용
  val money6 = Money(1_000L)
  val money7 = Money(1_000L)
  println(money6 + money7)

}

fun fun1(): Boolean {
  println("fun 1")
  return true
}

fun fun2(): Boolean {
  println("fun 2")
  return false
}

