package com.byeongsoon.lec17

import com.lannstark.lec17.Fruit
import com.lannstark.lec17.FruitFilter

fun main() {

  val fruits = listOf(
    Fruit("사과", 1_000),
    Fruit("사과", 1_200),
    Fruit("사과", 1_200),
    Fruit("사과", 1_500),
    Fruit("바나나", 3_000),
    Fruit("바나나", 3_200),
    Fruit("바나나", 2_500),
    Fruit("수박", 10_000),
  )

  // 람다를 만드는 방법 1
  // 함수의 타입을 표현하는 방법
  val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
    return fruit.name == "사과"
  }

  // 람다를 만드는 방법 2
  val isApple2 = { fruit: Fruit -> fruit.name == "사과"}

  // 람다를 직접 호출하는 방법 1
  isApple(fruits[0]);
  isApple2(fruits[0])
  // 람다를 직접 호출하는 방법 2
  isApple.invoke(fruits[0])

  filterFruits(fruits, isApple);

  // 마지막 파라미터가 함수인 경우 소괄호 바깥으로 뺄 수 있다.
  filterFruits(fruits) { it.name == "사과" }

}

// 자바에 작성된 filterFruits()를 옮기면
private fun filterFruits(
  fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
  val results = mutableListOf<Fruit>()

  for (fruit in fruits) {
    if (filter.invoke(fruit)) {
      results.add(fruit)
    }
  }
  return results
}



