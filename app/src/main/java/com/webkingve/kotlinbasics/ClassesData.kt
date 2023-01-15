package com.webkingve.kotlinbasics

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Alej")
    val name = user1.name

    println(name)
    user1.name = "Hugo"
    println(name)

    val user2 = User(1, "Hugo")
    println(user1.equals(user2))

    val updatedUser = user1.copy(name="Ramon")
    println(updatedUser)
    println(updatedUser.component1())
    println(updatedUser.component2())

    val (idr, namer) = updatedUser
    println(namer)
}