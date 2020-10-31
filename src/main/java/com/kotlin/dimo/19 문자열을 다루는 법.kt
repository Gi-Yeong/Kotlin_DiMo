package com.kotlin.dimo

fun main() {

    // 일치 하는 경우에만 true 반환
    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    println(test3.contains("lin"))
    println(test4.contains("lin"))

}