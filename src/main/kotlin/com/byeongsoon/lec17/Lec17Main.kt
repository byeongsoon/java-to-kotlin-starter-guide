package com.byeongsoon.lec17

import com.byeongsoon.lec12.Log
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

  // Lec18. 실습자료
  val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
  val map2: Map<String, Fruit> = fruits.associateBy { fruit -> fruit.name }


  //-----------------------------------------------------------

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

// 18강
// 리스트의 .filter(), .map()을 이용해서 람다를 더 활용할 수 있다.
// 놀랍게도 위의 함수가 아래처럼 한줄로 줄어든다..!
private fun filterFruits2(
  fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
  return fruits.filter(filter)
}

// .map 을 이용하여 필터링 된 결과의 가격을 가져올 수 있다.
// 에) 사과의 가격만을 알려주세요!
private fun filterFruitsPrice(
  fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Int> {
  println(fruits.size == fruits.count())
  return fruits.filter(filter)
    .map {fruit -> fruit.price }
}

fun fruitName(fruit: Fruit): String = fruit.name
val fruitName: (Fruit) -> String = fun(fruit: Fruit): String {
  return fruit.name
}




