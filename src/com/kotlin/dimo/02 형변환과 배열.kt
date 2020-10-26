package com.kotlin.dimo

fun main() {

    var a: Int = 54321

    var b: Long = a.toLong() // 명시적 형변환

    // 배열

    var intArr = arrayOf(1, 2, 3, 4, 5)
    intArr[2] = 8
    println(intArr[2])

    var nullArr = arrayOfNulls<Int>(5) // null 로 채워진 공간 5개의 배열이 생성 됨

}