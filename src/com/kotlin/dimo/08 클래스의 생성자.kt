package com.kotlin.dimo

fun main() {

    var a = PersonOne("박보영", 1990)
    var b = PersonOne("이루다")
    var c = PersonOne("류수정")

}

class PersonOne(var name: String, var birthYear: Int) {
    init {
        println("${this.birthYear}년생 ${this.name}님이 생성 되었습니다")
    }

    constructor(name: String) : this(name, 1997) {
        println("보조 생성자가 사용되었습니다")        
    }
}