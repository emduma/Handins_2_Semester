package com.example.handin2

// Task 2.2, Create a new class called Computer. Before you add any more code, know that you will need to add two additional classes: Laptop and SmartPhone:
// Parent class; Computer
open class Computer(val brand: String, val model: String, val priceInUsd: Double) {
    open fun powerOn() {
        println("$brand $model is now powering on...")
        Thread.sleep(2000)
        println("$brand $model is on.")
    }
    open fun powerOff() {
        println("$brand $model is now powering off...")
        Thread.sleep(2000)
        println("$brand $model is off.")
    }

    init {
        println("The device is a/an $brand $model.")
    }
}

// Two child classes, "Laptop" & "SmartPhone":
class Laptop(brand: String,
             model: String,
             priceInUsd: Double,
             val comesWithCharger: Boolean) : Computer(brand, model, priceInUsd) {

    var batteryLifeInPercentage: Int = 0
    fun checkBatteryLife() {
        if (batteryLifeInPercentage == 100) {
            println("$brand $model's battery is fully charged.")
        } else {
            println("$brand $model's battery has $batteryLifeInPercentage% left.")
        }
    }

}
class SmartPhone(brand: String,
                 model: String,
                 priceInUsd: Double,
                 val comesWithCharger: Boolean) : Computer(brand, model, priceInUsd) {

    var network: String = ""
    fun connectToNetwork() {
        println("$brand $model is now connecting to $network...")
        Thread.sleep(2000)
        println("$brand $model is connected to $network.")
    }
}