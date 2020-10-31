package com.kotlin.dimo

fun main() {

    UsingGeneric(A()).doShouting()
    UsingGeneric(BB()).doShouting()
    UsingGeneric(CC()).doShouting()

    doShouting(BB())

}

fun <T: A> doShouting(t: T) {
    t.shout()
}

open class A {
    open fun shout() {
        println("A가 소리 칩니다")
    }
}

class BB : A() {
    override fun shout() {
        println("B가 소리 칩니다")
    }
}

class CC : A() {
    override fun shout() {
        println("C가 소리 칩니다")
    }
}

class UsingGeneric<T: A> (var t: T) {
    fun doShouting() {
        t.shout()
    }
}