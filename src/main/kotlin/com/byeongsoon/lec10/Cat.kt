package com.byeongsoon.lec10

class Cat(
  species: String
) : Animal(species, 4) {

  // @Override가 아니라 override 지시어 사용
  override fun move() {
    println("고양이가 사뿐 사뿐 걸어가~")
  }

}