package com.byeongsoon.lec09

import com.lannstark.lec09.JavaPerson

fun main() {
  // .필드명 통해서 getter, setter를 사용할 수 있다.
  val person = Person("장병순", 30)
  println(person.name)
  person.age = 10
  println(person.age)

  val person2 = JavaPerson("장병순", 30)
  println(person.name)
  person.age = 10
  println(person.age)

  // :this(name,1)로 이름만 넣은 생성자 호출
  val person3 = Person("장병순")
  person3.age = 30
  println(person.age)

  val person4 = Person()

}