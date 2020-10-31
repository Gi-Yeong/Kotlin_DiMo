package com.kotlin.dimo

import kotlinx.coroutines.*

fun main() {

    runBlocking {
        var result = withTimeoutOrNull(50) {
            for (i in 1..100) {
                println(i)
                delay(10)
            }
            "Finish"
        }

        println(result)
    }
}