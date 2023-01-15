package com.webkingve.kotlinbasics

fun main(){
    var myName: String? = "Denis"
    myName = null
    println("Status is $myName")
    println(myName?.length)
    //myName = "Alej"
    //println(myName?.toLowerCase())

    if(myName != null){
        println("Is not null")
    }else{
        println("Is null")
    }

    println("----------------------")

    //ELVIS OPERATOR( ?:)
    val name = myName ?: "Guest"    //TAKE VAR VALUE, IS NULL TAKE A DEFAULT
    println(name)
}