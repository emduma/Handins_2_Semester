package com.example.handin3

// Task 3, Create a class that implements the following interface. Now create two objects using the class created
interface Vehicle {
    fun changeGear(a: Int);
    fun speedUp(a: Int)
    fun applyBrakes(a: Int)
}
// Class "Car":
class Car : Vehicle {

    private var currentSpeed = 0

    override fun changeGear(a: Int) {
        println("Current gear: $a")
    }
    override fun speedUp(a: Int) {
        currentSpeed += a
        println("Speeding up by $a km/h. Current speed is now $currentSpeed km/h.")
    }
    override fun applyBrakes(a: Int) {
        currentSpeed -= a
        println("Applying brakes, reducing speed to $a km/h. Current speed is now $currentSpeed km/h.")
    }
}