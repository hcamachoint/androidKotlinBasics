package com.webkingve.kotlinbasics

fun main(){ //this is the principal function os the application by kotlin default
    /*
    This is my multi lime comments
    */
    var myName = "Alej"     //can be reasignable
    val myAge = 32          //cant be reasignable

    //INTEGER TYPES: Byte(8 Bit), Short(16 Bit), Int(32 Bit), Long(64 Bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300

    //FLOATING TYPES: Float(32 Bit), Double(64 Bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    //BOOLEAN TYPES: true or false
    var isSunny: Boolean = false

    //CHARACTERS
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //THIS IS THE TEST
    var mstr: String = "Android Masterclass"
    var mfloat: Float = 13.37F
    val mdouble: Double = 3.14159265358979
    var mint: Byte = 25
    var mshort: Short = 2020
    var mlong: Long = 18881234567
    var mbool: Boolean = true
    val mstri: Char = 'a'

    //ARITHMETIC OPERATORS(+, -, *, /, %)
    var result = 5 + 3
    result = result / 2
    result += 10
    val aa = 5.0
    val bb = 10
    var resultDouble: Double = (aa / bb)
    println(resultDouble)

    //COMPARATION OPERATORS(==, !=, <, >, <=, >=)
    val isEqual = 5 == 3
    println(isEqual)
    println("Is greater ${5 > 3}")

    //ASSIGNMENT OPERATORS(+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 5
    println(myNum)

    //INCREMENTE & DECREMENT OPERATORS(++, --)
    myNum++
    println(myNum)
    println("Last char in str is " + lastCharInStr)
    println("Last char in str is $lastCharInStr and the lengh of myStr is ${myStr.length}")
}