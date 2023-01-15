package com.webkingve.kotlinbasics

fun main(){
    var x = 0
    while (x <= 10){    //THIS EXECUTE ONLY UNDER CONDITION IS CORRECT
        println(x)
        x++
    }
    println("The end")

    var y = 11
    do{                 //THIS EXECUTE AND REPEAT IF CONDITION IS CORRECT
        println("Im younger")
        y++
    }while(y < 10)
}