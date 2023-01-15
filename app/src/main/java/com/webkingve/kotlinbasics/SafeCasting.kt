package com.webkingve.kotlinbasics

fun main(){
    var location: Any = "Kotlin"
    val safeString: String? = location as? String   //safe conversion from any to string
    val safeInt: Int? = location as? Int            //safe conversion from any to int

    println(safeString)
    println(safeInt)
}