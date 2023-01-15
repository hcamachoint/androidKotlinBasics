package com.webkingve.kotlinbasics

fun main(){
    var name = "Alej"
    try {
        Integer.parseInt(name)
    }catch (e: ArithmeticException){
        println("Arithmetic error")
    }catch (e: Exception){
        println("Error conversion: $e")
    }finally{
        println("Finally running")
    }
}