package com.webkingve.kotlinbasics

fun main(){
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    println(sum(10, 3))

    val sumShort = {a:Int, b:Int -> println(a + b)}
    sumShort(4, 6)
}