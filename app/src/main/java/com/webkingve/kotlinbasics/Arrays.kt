package com.webkingve.kotlinbasics

fun main(){
    val numbers = arrayOf(1,2,3,4,5)
    val numbersDouble = doubleArrayOf(2.0, 3.0, 4.0, 5.0, 6.0)

    numbers[0] = 7
    numbers[2] = 9

    println(numbers)
    println(numbers[0])
    println(numbers.contentToString())
    println(numbersDouble.contentToString())


    for(element in numbers){
        println(element)
    }

    for(index in numbersDouble.indices){
        println("${numbersDouble[index]}")
    }
}