package com.byeongsoon.lec02

import com.lannstark.lec02.Person


fun main() {

  val str:String? = "ABC"

  // safe call
  println(str?.length)

  // Elvis 연산자
  println(str?.length ?: 0)

  // null 아님 단언!!
  println(startWithA("Apple"))

  val person = Person(null)

  // 자바 코드에 Null 관련 정보가 있으면 코틀린의 null safe 사용한 메소드 호출
  startWithA2(person.name)
}

fun startWithA1(str: String?): Boolean {
//  if(str == null) {
//    throw IllegalAccessException("null이 들어왔습니다.")
//  }
//  return str.startsWith("A")

  return str?.startsWith("A")
    ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startWithA2(str: String?): Boolean? {
//  if(str == null) {
//    return null
//  }
//  return str.startsWith("A")

  return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
//  if(str == null) {
//    return false
//  }
//  return str.startsWith("A")

  return str?.startsWith("A") ?: false
}

fun startWithA4(str: String): Boolean {
  return str.startsWith("A")
}

fun startWithA(str: String?): Boolean {
  return str!!.startsWith("A")
}