package com.example.handin2

// Task 2.3, Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory...
// Base class "Product":
open class Product(val name: String, val price: Double, val quantity: Int) {
    open fun identifyProductCategory() {
        println("I am a product.")
    }
}

// Subclass "Shoe":
class Shoe(name: String, price: Double, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a shoe.")
    }
}
// Subclass "T-shirt":
class TShirt(name: String, price: Double, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a T-shirt.")
    }
}
// Subclass "Book":
class Book(name: String, price: Double, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a book.")
    }
}