package com.webkingve.kotlinbasics

open class Vehicle{     //super class, parent class, base class
    //properties
    //methods
}

open class Auto(val name: String, val brand: String){  //sub class child class or derived class of vehicle. //super class, parent class, base class
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount > 0){
            range += amount
        }
    }

    open fun drive(distance: Double){
        println("Drove for $distance")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double) : Auto(name, brand){ //sup class child class or derived class of car
    override var range = batteryLife * 6
}

fun main(){
    var myCar = Auto("A3", "Audi")
    var myEcar = ElectricCar("S-Model", "Tesla", 85.0)

    myCar.drive(30.0)
    myEcar.drive(10.0)
}