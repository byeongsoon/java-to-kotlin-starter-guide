package com.byeongsoon.lec10

class Penguin(
  species: String
) : Animal(species, 2), Swimable, Flyable {

  private val wingCount: Int = 2

  override fun move() {
    println("펭귄이 움직인다~ 꿱꿱")
  }

  // 부모 클래스의 legCount 에는 open 키워드 붙여야 함
  override val legCount: Int
    get() = super.legCount + this.wingCount

  // 자바와 인터페이스 함수 호출 부분 문법이 다름
  override fun act() {
    super<Swimable>.act()
    super<Flyable>.act()
  }

  override fun fly() {
    TODO("Not yet implemented")
  }

  // 코틀린에서는 인터페이스에 프로퍼티를 넣어서 custom getter 를 강제할 수 있다.
  // backing field 없는!
  override val swimAbility: Int
    get() = 3

}