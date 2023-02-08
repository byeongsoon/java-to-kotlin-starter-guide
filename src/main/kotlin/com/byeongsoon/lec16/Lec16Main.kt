package com.byeongsoon.lec16

import com.lannstark.lec16.Person

fun main() {
  // 확장함수 사용
  val str = "ABC"
  println(str.lastChar())

  val person = Person("A", "B", 100)
  person.nextYearAge()
}

/*
* 확장함수
* 클래스 외부에 만들지만 클래스 내부에 있는 메소드처럼 사용할 수 있다.
* fun 확장하려는클래스.함수이름(파라미터) : 리턴타입
* this를 이용해 실제 클래스 안의 값에 접근
* 확잠함수에서는 private 또는 protected 멤버를 가져올 수 없다.
*
 */
fun String.lastChar(): Char {
  return this[this.length - 1]
}

// 멤버 함수와 확장 함수의 시그니처가 동일하면 멤버 함수가 호출된다.
fun Person.nextYearAge(): Int {
  println("확장 함수")
  return age + 1
}