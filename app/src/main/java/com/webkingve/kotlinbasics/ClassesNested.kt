package com.webkingve.kotlinbasics

class OuterClass{   //NESTED EXAMPLE
    private var name: String = "Mr. X"
    class NestedClass{
        var description: String = "Code inside nested class"
        private var id: Int = 101
        fun foo(){
            println("ID is ${id}")  //cant access to main var name
        }
    }
}

class OutsideClass{   //NESTED EXAMPLE
    private var name: String = "Mr. X"
    inner class InnerClass{
        var description: String = "Code inside nested class"
        private var id: Int = 101
        fun foo(){
            println("Name is ${name}")  //can access to main var name
        }
    }
}

fun main(){
    println(OuterClass.NestedClass().foo())
    println(OutsideClass().InnerClass().foo())
}