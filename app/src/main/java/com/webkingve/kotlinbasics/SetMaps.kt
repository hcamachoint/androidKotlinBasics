package com.webkingve.kotlinbasics

fun main(){
    val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Mango", "Orange")
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")

    println(newFruits)
    println(newFruits.elementAt(3))

    println("------------------------")

    val dayOfWeek = mapOf(4 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(dayOfWeek)
    println(dayOfWeek[2])
    println(dayOfWeek.toSortedMap())

    /*for(item in dayOfWeek.keys){
        println(item)
    }*/
}