package com.example.handin2

fun main() {

    println("---------- TASK 2.1 ----------")

    val employee1 = Employee("Emil", "Dupont", 5000.0)
    val employee2 = Employee("Sofie", "Falk", 10000.0)

    // Create two Employee objects and display each object’s yearly salary:
    println("${employee1.firstName}'s yearly salary is: ${employee1.yearlySalary()} DKK.")
    println("${employee2.firstName}'s yearly salary is: ${employee2.yearlySalary()} DKK.")

    // Give each Employee a 10% raise and display each Employee’s yearly salary again:
    employee1.raiseSalaryInPercent(10.0)
    employee2.raiseSalaryInPercent(10.0)

    println("-----")
    println("${employee1.firstName}'s yearly salary after a 10% increase is: ${employee1.yearlySalary()} DKK.")
    println("${employee2.firstName}'s yearly salary after a 10% increase is: ${employee2.yearlySalary()} DKK.")
    println("\n")

    println("---------- TASK 2.2 ----------")

    // Laptop object:
    val laptop = Laptop("Apple", "MacBook Pro M3", 1599.0, true)
    laptop.powerOn()
    laptop.batteryLifeInPercentage = 100
    laptop.checkBatteryLife()
    laptop.powerOff()

    println("-----")
    // Smartphone object:
    val smartPhone = SmartPhone("Apple", "iPhone 15 Pro", 999.0, true)
    smartPhone.powerOn()
    smartPhone.network ="Wi-Fi"
    smartPhone.connectToNetwork()
    smartPhone.powerOff()
    println("\n")

    println("---------- TASK 2.3 ----------")

    val shoe = Shoe("Adidas Spezial", 899.0, 1)
    val tShirt = TShirt("Uniqlo Heavyweight T-shirt", 149.0, 4)
    val book = Book("Harry Potter and the Philosopher's Stone", 109.95, 2)

    shoe.identifyProductCategory()
    tShirt.identifyProductCategory()
    book.identifyProductCategory()
    println("\n")

    println("---------- TASK 2.4 ----------")

    val circle = Circle("Blue", true, 10.0)
    val rectangle = Rectangle("Blue", true, 10.0, 5.0)
    val triangle = Triangle("Blue", false, 5.0, 5.0, 5.0)

    // Perimeter & Area of all shapes:
    println("Your circle's perimeter is ${circle.calculatePerimeter()} and its' area is ${circle.calculateArea()}.")
    println("Your rectangle's perimeter is ${rectangle.calculatePerimeter()} and its' area is ${rectangle.calculateArea()}.")
    println("Your triangle's perimeter is ${triangle.calculatePerimeter()} and its' area is ${triangle.calculateArea()}.")

}