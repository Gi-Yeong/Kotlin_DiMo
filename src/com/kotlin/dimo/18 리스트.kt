package com.kotlin.dimo

fun main() {

    val a = listOf("사과", "딸기", "배")
    println(a[1])

    for (fruit in a) {
        print("${fruit}: ")
    }

    println()

    val b = mutableListOf(6, 3, 1)
    println(b)

    b.add(4)
    println(b)

    b.add(2, 8)
    println(b)

    b.removeAt(1)
    println(b)

    b.shuffle()
    println(b)

    b.sort()
    println(b)

}
