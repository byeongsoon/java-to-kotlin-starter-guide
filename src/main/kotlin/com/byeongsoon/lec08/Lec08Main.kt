package com.byeongsoon.lec08

fun main() {
  repeat("Hello World")
  // Named Argument
  repeat("Hello World", useNewLine = false)
  printNameAndGender(gender = "MALE", name = "장병순")
  // 자바 함수를 가져다 쓸 때는 named argument를 쓸 수 없다.

  // 가변인자 호출 시
  printAll("A", "B", "c")
  val array = arrayOf("A", "B", "C")
  // 배열을 넣어줄 때 *(스프레드 연산자)를 붙여준다
  printAll(*array)
}

// Expression 이기 때문에 바로 if 문을 return 가능
fun maxV1(a: Int, b: Int): Int {
  return if (a > b) {
    a
  } else {
    b
  }
}

// 하나의 값으로만 이루어져 있다면 중괄호를 생략하고 = 으로 표시 가능하다.
fun maxV2(a: Int, b: Int): Int =
  if (a > b) {
    a
  } else {
    b
  }

// a, b가 모두 Int 형이기 때문에 타입 생략 가능
// 중괄호는 사용하는 경우 반환 타입이 Unit이 아닌 경우에는 명시해줘야 한다.
fun maxV3(a: Int, b: Int) = if (a > b) { a } else { b }

// 조건의 실행 부분도 하나라면 중괄호 생략 가능
fun maxV4(a: Int, b: Int) = if (a > b) a else b

// default parameter
// 자바의 오버로딩의 단점을 보완할 수 있다.. 중복제거 등등
fun repeat(
  str: String,
  num: Int = 3,
  useNewLine: Boolean = true
) {
  for (i in 1..num) {
    if (useNewLine) {
      println(str)
    }
    print(str)
  }
}

// Builder를 만들지않고 Builder의 장점을 쓸 수 있다.
fun printNameAndGender(name: String, gender: String) {
  println(name)
  println(gender)
}

// 가변인자 - 같은 타입의 여러 파라미터 받기
fun printAll(vararg strings: String) {
  for (str in strings) {
    println(str)
  }
}