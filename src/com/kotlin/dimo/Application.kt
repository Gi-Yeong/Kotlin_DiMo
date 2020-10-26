package com.kotlin.dimo

fun main() {

    var a: Int
    a = 123
    println(a)

    var b: Int? = null // nullable 변수, 꼭 필요한 경우에만 사용 하자

    // 정수형
    var byte: Byte          // 8 bit
    var Short: Short        // 16 bit
    var Int: Int = 1234     // 32 bit
    var intValueByHex: Int = 0x1af      // 16 진수의 경우 0x 를 앞에 붙인다
    var intValueByBin: Int = 0b10110110 // 2 진수의 경우 0b 를 붙인다
    var Long: Long = 1234L              // 64 bit

    // 실수형
    var floatValue: Float = 123.5f              // 32 bit
    var doubleValue: Double = 123.5             // 64 bit
    var doubleValueWithExp: Double = 123.5e10   // 지수 표기볍은 e 를 넣어준다

    // 문자형은 2 byte
    var charValue: Char = 'a'
    var koreanCharValue: Char = '가'

    var booleanValue: Boolean = true

    var stringValue = "one line string test"
    var multilineStringValue = """multiline
        |string
        |test
    """.trimMargin()

}