package com.kotlin.dimo

fun main() {

    var a = 7

    if (a > 10) {
        println("a가 10보다 크다")
    } else {
        println("a가 10보다 작거나 같다")
    }

    doWhen(1)
    doWhen("DiMo")
    doWhen(12L)
    doWhen(3.14159)
    doWhen("Kotlin")

    doWhenReturnValue(1)
    doWhenReturnValue("DiMo")
    doWhenReturnValue(12L)
    doWhenReturnValue(3.14159)
    doWhenReturnValue("Kotlin")

}

fun doWhen(a: Any) {
    when (a) {
        1 -> println("정수 1 입니다.")
        "DiMo" -> println("디모의 코틀린 강좌 입니다")
        is Long -> println("Long 타입 입니다")
        !is String -> println("String 타입이 아닙니다")
        else -> println("어떠한 조건도 만족하지 않습니다")
    }
}

fun doWhenReturnValue(a: Any) {
    var result = when (a) {
        1 -> "정수 1입니다"
        "DiMo" -> "디모의 코틀린 강좌입니다"
        is Long -> "Long 타입 입니다"
        !is String -> "String 타입이 아닙니다"
        else -> "어떤 조건도 만족하지 않습니다"
    }
    println(result)
}