package com.byeongsoon.lec13

class House (
  private val address: String,
  private val livingRoom: LivingRoom
) {

  // 권장되는 중첩 클래스(static)을 만들 때는 그냥 만들면 된다.
  // 바깥 클래스와 연결되지 않은
  class LivingRoom(
    private var area: Double
  ) {

  }

  // 권장하지 않는 중첩 클래스 / 바깥 클래스와 연결된
  // inner 키워드를 사용한다.
  // this@바깥클래스.프로퍼티
  inner class LivingRoomTwo(
    private var area: Double
  ) {
    val address: String
      get() = this@House.address
  }

}