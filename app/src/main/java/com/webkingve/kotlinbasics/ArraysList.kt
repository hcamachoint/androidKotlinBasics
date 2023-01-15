package com.webkingve.kotlinbasics

fun main(){
    val arrayList: ArrayList<String> = ArrayList()
    arrayList.add("One")
    arrayList.add("Two")

    val doubleArrayList: ArrayList<Double> = ArrayList()
    doubleArrayList.add(2.0)
    doubleArrayList.add(3.0)
    doubleArrayList.add(4.0)
    var sum = 0.00
    /*for(i in arrayList){
        println(i)
    }
    println(arrayList.get(0))*/

    for(i in doubleArrayList){
        sum+=i
    }
    println("Average is ${sum/doubleArrayList.size}")
}