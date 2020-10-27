package com.kotlin.dimo

fun main() {

    EventPrinter().start()

}

interface EventListener {
    fun onEvent(count: Int)
}

class Counter(var listner: EventListener) {

    fun count() {
        for (i in 1..100) {
            if (i % 5 == 0) listner.onEvent(i)
        }
    }
}

class EventPrinter {
    fun start() {
        val counter = Counter(object : EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}