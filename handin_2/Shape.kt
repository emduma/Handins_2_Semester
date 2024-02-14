package com.example.handin2
import kotlin.math.sqrt

// Task 2.4, Create 3 classes Circle, Rectangle & Triangle with a parent class: Shape...
// Base class "Shape":
abstract class Shape(val color: String, val isTransparent: Boolean) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

// Subclass 1 "Circle":
class Circle(color: String,
             isTransparent: Boolean,
             private val radius: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return (2 * Math.PI * radius)
    }

    override fun calculateArea(): Double {
        return Math.PI * (radius * radius)
    }
}
// Subclass 2 "Rectangle":
class Rectangle(color: String,
                isTransparent: Boolean,
                private val width: Double,
                private val height: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return 2 * (height + width)
    }

    override fun calculateArea(): Double {
        return height * width
    }
}
// Subclass 3 "Triangle":
class Triangle(color: String,
               isTransparent: Boolean,
               private val sideA: Double,
               private val sideB: Double,
               private val sideC: Double) : Shape(color, isTransparent) {
    override fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    override fun calculateArea(): Double {
        // val "s" = semi-perimeter in Heron's formula:
        val s = (sideA + sideB + sideC) / 2
        return sqrt(s * (s-sideA) * (s-sideB) * (s-sideC))
    }
}