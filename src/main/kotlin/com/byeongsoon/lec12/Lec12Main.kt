package com.byeongsoon.lec12

import com.lannstark.lec12.Movable

fun main() {
  // 싱글톤 객체는 클래스 이름으로 접근하여 getter, setter를 모두 사용가능
  println(Singleton.a)
  Singleton.a += 10
  println(Singleton.a)

  // 익명 클래스 -> object : 타입이름을 이용한다.
  moveSomething(object : Movable {
    override fun move() {
      println("무브 무브")
    }

    override fun fly() {
      println("날다 날다")
    }
  })

}

private fun moveSomething(movable: Movable) {
  movable.move()
  movable.fly()
}