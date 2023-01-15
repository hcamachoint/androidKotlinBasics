package com.webkingve.kotlinbasics

fun main(){
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1,2,3,true,false,"message")

    //println(anyTypes.size)
    //println(months[1])

    /*for(month in months){
        println(month)
    }*/

    val addionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    addionalMonths.addAll(newMonths)
    addionalMonths.add("July")
    addionalMonths.removeAt(1)

    println(addionalMonths)
}