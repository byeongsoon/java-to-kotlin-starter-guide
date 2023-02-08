package com.byeongsoon.lec10

// 필드에 대한 오버라이드를 하려면 Open 이라는 키워드를 붙여야한다.
abstract class Animal(
  protected val species: String,
  protected open val legCount: Int
){

  abstract fun move()

}