package com.kotlin.dimo

fun main() {

    b(::a)

    var c: (String) -> Unit = { str ->
        println("${str} 람다 함수")
    }

    b(c)


}

fun a(str: String) {
    println("${str} 함수 a")
}

fun b(f: (String) -> Unit) {
    f("b 가 호출한")
}
