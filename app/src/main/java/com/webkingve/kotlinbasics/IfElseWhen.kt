package com.webkingve.kotlinbasics

fun main(){
    //IF ELSE STATEMENT
    var heightPerson1 = 170
    var heightPerson2 = 189
    var isGreaterAge = true

    if(heightPerson1 > heightPerson2) {
        println("Person 1 is higher")
    }else if(heightPerson1 == heightPerson2){
        println("Is the same age")
    }else{
        println("Person 2 is higher")
    }

    if(isGreaterAge)
        println("Yes it is")

    //WHEN STATEMENT
    var season = 0
    when(season){
        1 -> println("Is 1")
        2 -> println("Is 2")
        3 -> {
            println("Is 3")
            println("This is multi actions")
        }
        4 -> println("Is 4")
        else -> println("Is nothing")
    }

    var month = 4
    when(month){
        !in 1..3 -> println("Is not 1 range of 3")
        in 3..5 -> println("Spring")
        in 6..8 -> {
            println("Winter")
            println("so, winter is comming")
        }
        in 12 downTo 8 -> println("No is winter, so...")
        12, 1, 2 -> println("Vacation week")
        else -> println("Go work men")
    }

    var x: Any = 13.33
    when(x){
        is Int -> println("Is int")
        is Float -> println("Is float")
        is Double -> println("Is double")
        is String -> println("Is string")
        else -> println("I dont know what is")
    }
}