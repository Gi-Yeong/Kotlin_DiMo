package com.kotlin.dimo

fun main() {

    var t = Tiger()
    t.eat()

    var r = Rabbit()
    r.eat()
    r.sniff()

    var d = DogOne()
    d.run()
    d.eat()
}

open class AnimalOne {
    open fun eat() {
        println("음식을 먹습니다.")
    }

}

class Tiger : AnimalOne() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}

abstract class AnimalTwo() {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : AnimalTwo() {
    override fun eat() {
        println("당근을 먹습니다")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class DogOne : Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다")
    }

    override fun eat() {
        println("허겁지겁 먹습니다")
    }
}