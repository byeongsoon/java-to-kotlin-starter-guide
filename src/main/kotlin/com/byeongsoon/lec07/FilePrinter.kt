package com.byeongsoon.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

  // Checked Exception과 unchecked Exception을 구분하지 않는다.
  // 모두 Unchecked Exception
  fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
  }

  // try with resources 대신에 use(inline 함수) 사용
  fun readFileV2(path: String) {
    BufferedReader(FileReader(path)). use { reader ->
      println(reader.readLine())
    }
  }

}