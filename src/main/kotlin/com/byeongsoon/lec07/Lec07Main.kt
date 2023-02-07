package com.byeongsoon.lec07

import java.lang.NumberFormatException

// try-catch
fun parseIntOrThrow(str: String): Int {
  try {
    return str.toInt()
  } catch (e: NumberFormatException) {
    throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다.")
  }
}

// 하나의 Expression 으로 간주된다.
fun parseIntOrThrowV2(str: String): Int? {
  return try {
    str.toInt()
  } catch (e: NumberFormatException) {
    null
  }
}