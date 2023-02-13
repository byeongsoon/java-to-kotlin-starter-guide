package com.byeongsoon.lec20

import com.byeongsoon.lec19.Person

fun main() {

}

// scope function(영역 함수)
fun printPerson(person: Person?) {
  // let은 scope function의 한 종류
  person?.let {
    println(it.name)
    println(it.age)
  }
  // 아래 코드를 위처럼 리팩터링 가능하다.
  if (person != null) {
    println(person.name)
    println(person.age)
  }
}