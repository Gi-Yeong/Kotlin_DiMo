package com.kotlin.dimo

fun main() {

    var a = 0

    while (a < 5) {
        println(a++)
    }

    println()

    a = 0
    do {
        println(a++)
    } while (a < 5)

    println()

    for (i in 0..9 step 3) {
        print(i)
    }
    println()
    for (i in 9 downTo 0) {
        print(i)
    }
    println()
    for (i in 'a'..'e') {
        print(i)
    }
}