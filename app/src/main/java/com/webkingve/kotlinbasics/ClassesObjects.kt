package com.webkingve.kotlinbasics

fun main(){
    var alej = Person("Alej", "Cam", "Guaira")

    var civic = Car("Black", "Civic", "Honda")
    //civic.accelerate()
    //println(civic.speed)

    var xiaomi = Xiaomi("Xiaomi", "Redmi Note 11S")
    xiaomi.chargeBattery(20)
    println(xiaomi.battery)
}

class Person constructor(firstName: String, lastName: String, addressName: String = "Unknow"){
    init{
        //println("Person created with name $firstName $lastName from $addressName")
    }
}

class Car(colorName: String, modelName: String, brandName: String){
    //MEMBER VARIABLES - PROPERTIES
    var tire : String? = null
    var wheel : String? = null
    var speed : Int? = null
        set(value){
            field = value
        }

    //MEMBER FUNCTIONS - METHODS
    fun accelerate(){
        this.speed = 20
    }

    //INIT FUNCTIONS
    init{
        //println(tire)
    }

}

class Xiaomi(brandName: String, modelName: String){
    var battery = 10

    fun chargeBattery(chargedBy: Int){
        battery += chargedBy
    }
}