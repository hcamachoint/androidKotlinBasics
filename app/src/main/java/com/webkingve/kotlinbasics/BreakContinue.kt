package com.webkingve.kotlinbasics

fun main(){
    for(num in 1 until 20){
        println("Num is $num")
        if(num/2 == 5){
            break   //or continue
        }
    }
}