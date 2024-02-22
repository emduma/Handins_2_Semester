package com.example.handin3

// Task 2, Create an interface called FastFood and create a Sandwich class, a Pizza class and a class you decide that implements the FastFood interface.
interface FastFood {
    fun order()
    fun serve()
    fun eat()
}

// Class "Burger:
class Burger : FastFood {
    override fun order() {
        println("A burger has been ordered!")
    }
    override fun serve() {
        println("Burger is being served!")
    }
    override fun eat() {
        println("Burger is being eaten. It's very good!")
    }
}

// Class "Sandwich"
class Sandwich : FastFood {
    override fun order() {
        println("A sandwich has been ordered!")
    }
    override fun serve() {
        println("Sandwich is being served!")
    }
    override fun eat() {
        println("Sandwich is being eaten. It's very healthy!")
    }
}

// Class "Pizza:
class Pizza : FastFood {
    override fun order() {
        println("A pizza has been ordered!")
    }
    override fun serve() {
        println("Pizza is being served!")
    }
    override fun eat() {
        println("Pizza is being eaten. It's very yummy!")
    }
}

// Class decided by me "Kebab":
class Kebab: FastFood {
    override fun order() {
        println("A kebab has been ordered!")
    }
    override fun serve() {
        println("Kebab is being served!")
    }
    override fun eat() {
        println("Kebab is being eaten. It's very spicy!")
    }
}