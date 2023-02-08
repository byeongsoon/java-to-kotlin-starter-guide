package com.byeongsoon.lec10

interface Flyable {

  // 자바 8에 등장한 개념인 default method
  //  default 키워드를 사용하지 않아도 인터페이스의 디폴트 메소드 만들 수 있음
  fun act() {
    println("파닥 파닥")
  }

  fun fly()

}