package com.webkingve.kotlinbasics

fun main(){
    myFunction()
    var result = mySum(3, 2)
    println(result)
}

fun myFunction(){
    println("My Print function")
}

fun mySum(a: Int, b: Int) : Int{
    return a + b
}