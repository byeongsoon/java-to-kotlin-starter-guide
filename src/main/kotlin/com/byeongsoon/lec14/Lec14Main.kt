package com.byeongsoon.lec14

fun main() {

  val dto1 = PersonDto("장병순",100)
  val dto2 = PersonDto("장병순", 100)

  println(dto1)
  println(dto1.equals(dto2))

}

// enum 클래스를 받아서 when에 사용하면 else를 사용하지 않아도 된다.
// enum 클래스에 변화가 있음녀 알 수 있다.
fun handleCountry(country: Country) {
  when (country) {
    Country.KOREA -> TODO()
    Country.AMERICA -> TODO()
  }
}

private fun handleCar(car: HyundaiCar) {
  when (car) {
    is Avante -> TODO()
    is Sonata -> TODO()
    is Grandeur -> TODO()
  }
}