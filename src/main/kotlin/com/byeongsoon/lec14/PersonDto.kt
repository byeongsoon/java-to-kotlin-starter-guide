package com.byeongsoon.lec14

// data 키워드를 붙이면 자동으로 equals(), hashCode(), toString()을 만들어준다.
data class PersonDto(
  private val name: String,
  private val age: Int,
) {

}