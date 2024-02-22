package com.example.exercises_algorithms

fun main() {
    // TwoSum problem:
    println(twoSum(intArrayOf(1, 2, 5, 6, 8, 11, 15), 19))
    println()

}

// TwoSum problem:
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have *exactly* one solution, and you may not use the same element twice.
// You can return the answer in any order.

fun twoSum(nums: IntArray, target: Int) : String {
    for (i in nums.indices) {
        for (j in nums.indices) {
            if (i != j) {
                if (nums[i] + nums[j] == target) {
                    return "$i, $j"
                }
            }
        }
    }
    return "Target not found in intArray."
}

