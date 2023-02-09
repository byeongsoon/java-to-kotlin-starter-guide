package com.byeongsoon.lec09

// constructor 지시어는 생략 가능하다.
// 코틀린에서는 생성자에서 프로퍼티를 만들 수 있다.
// 주생성자
class Person (
  name: String = "장병순",
  var age: Int = 1
) {

  // getter를 부르는 무한루프가 발생하기 때문에 field라는 예약어 사용
  var name = name
    get() = field.uppercase()
    set(value)  {
      field = value.uppercase()
    }

  fun getUppercaseName(): String {
    return this.name.uppercase()
  }

  val uppercaseName2: String
    get() = this.name.uppercase()

  // 생성자가 호출되는 시점에 호출되는 init으로 검증 등을 수행
  init {
    if (age <= 0) {
      throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
    }
    println("초기화 블록")
  }

  // 부생성자 보다는 default parameter를 권장한다.
  // 부생성자 -> 최종적으로 주생성자를 호출해줘야 한다.(: this() 이용)
  constructor(name: String): this(name, 1) {
    println("첫 번째 부생성자")
  }

  // 부생성자에서 주생성자로 가는 중간에 부생성자를 호출해도 된다.
  constructor(): this("홍길동") {
    println("두 번째 부생성자")
  }

  // 함수처럼 만드는 방법
  fun isAdult(): Boolean {
    return this.age >= 20
  }

  // custom getter -> 프로퍼티처럼 만드는 방법
  // get() = 뒤에는 함수 표현식인데 하나의 Expression 으로 표현이 가능하면 아래오 같이 표현 가능
  val isAdult2: Boolean
    get() = this.age >= 20
  // 객체의 속성을 나타내면 커스텀 getter, 그렇지 않다면 함수



}