package com.byeongsoon.lec11

private val Number = 3

fun add(a: Int, b: Int): Int {
  return a + b
}


// public 이외의 다른 접근제한자를 사용하려면 constructor를 붙여야한다.
class Cat private constructor(

)

class Car(
  internal val name: String,
  private val owner: String,
  _price: Int
) {
  var _price = _price
    private set
}

