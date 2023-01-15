package com.webkingve.kotlinbasics

fun main(){
    for(num in 1..10){
        println("Num is $num")
    }

    println("-----------------")
    for(num in 1 until 10){
        println("Said $num")
    }

    println("-----------------")
    for(num in 10 downTo 1 step  2){ //STEP es para saltar ejemplo de 2 en 2
        println("Say $num")
    }

    println("-----EXERCISES AREA-----")
    for(num in 1..10000){
        if(num == 9001){
            println("IT'S OVER 9000!!!")
        }
    }
}