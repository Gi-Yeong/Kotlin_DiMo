package com.kotlin.dimo

fun main() {

    println(add(5, 6, 7))
    println(add1(8, 9, 10)) // 단일 표현 함수

}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// 단일 표현 함수
fun add1(a: Int, b: Int, c: Int) = a + b + c