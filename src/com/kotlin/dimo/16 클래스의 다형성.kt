package com.kotlin.dimo

fun main() {

    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    if (b is Cola) { // is 는 조건문 안에서만 다운 캐스팅 된다
        b.washDishes()
    }

    var c = b as Cola // as 는 반환 값 c 뿐 아니라 변수 b 자체도 다운 캐스팅 된다
    c.washDishes()
    b.washDishes()

}

open class Drink {
    var name = "음료"

    open fun drink() {
        println("${name}을 마십니다")
    }
}

class Cola: Drink() {
    var type = "콜라"

    override fun drink() {
        println("$name 중에 ${type}을 마십니다")
    }
    
    fun washDishes() {
        println("${type}로 설거지를 합니다")
    }
}