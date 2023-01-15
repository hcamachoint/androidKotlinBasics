package com.webkingve.kotlinbasics

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is breaking")
    }
}

