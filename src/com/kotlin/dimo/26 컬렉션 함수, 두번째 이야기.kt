package com.kotlin.dimo

fun main() {

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })

    val names = listOf("A", "B", "C", "D")

    println(names zip numbers)

}