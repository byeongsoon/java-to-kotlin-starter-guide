package com.byeongsoon.lec12

class Person private constructor(
  val name: String,
  var age: Int
) {

  // 이 클래스와 동행하는 유일한 객체!
  // companion object는 이름도 붙일 수 있고, 인터페이스르 구현할 수도 있다.
  // 자바에서 사용하려면 @JvmStatic을 붙여야 한다.
  // 혹은 이름이나 Companion을 이용한다.
  companion object Factory : Log{
    // 컴파일 시에 변수가 할당
    private const val MIN_AGE = 1
    fun newBaby(name: String): Person {
      return Person(name, MIN_AGE)
    }

    override fun log() {
      println("나는 Person 클래스 동행객체 Factory 입니다.")
    }
  }

}

object Singleton {
  var a: Int = 0
}