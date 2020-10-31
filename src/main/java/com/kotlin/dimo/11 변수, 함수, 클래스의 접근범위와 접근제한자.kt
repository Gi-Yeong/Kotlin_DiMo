package com.kotlin.dimo

var a = "패키지 스코프"


class B {
    var a = "클래스 스코프"
    fun print() {
        println(a)
    }
}

fun main() {
    var a = "함수 스코프"
    println(a)
    B().print()
}