package com.example.handin3

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main() {

    println("------- Task 1 -------")
    val listOfArticles = arrayListOf(
        Article("John Johnson", "Welcome to KEA"),
        Article("Joe Joeson", "Why Internet Piracy Is Good"),
        Article("Hugh Mungus", "The Meaning of Life"),
        Article("Yuri Goodman", "The Art of Figure-skating"),
        Article("Seymour Butts", "I Adopted a Ferret. Here's why")
    )
    for (article in listOfArticles) println(article)
    println()

    println("------- Task 2 -------")
    val fastFoods = arrayOf(Burger(), Sandwich(), Pizza(), Kebab())
    for (food in fastFoods) {
        food.order()
        food.serve()
        food.eat()
        println()
    }

    println("------- Task 3 -------")
    val audiR8 = Car()
    val citroenC1 = Car()

    audiR8.changeGear(3)
    audiR8.speedUp(100)
    audiR8.applyBrakes(25)
    println()
    citroenC1.changeGear(2)
    citroenC1.speedUp(50)
    citroenC1.applyBrakes(20)
    println()

    println("------- Task 4 -------")
    // Create posts(3):
    val post1 = RedditPost("BigMan57", "Am I allergic to water?")
    val post2 = RedditPost("CheeseBoy81", "Why do cats hate me?")
    val post3 = RedditPost("MayoHater49", "Mayo sucks. Here's why.")

    // Assign up- and downvotes to each post:
    repeat(25) { post1.upvote() }
    repeat(5) { post1.downvote() }

    repeat(50) { post2.upvote() }
    repeat(10) { post2.downvote() }

    repeat(0) { post3.upvote() }
    repeat(100) { post3.downvote() }

    // Show posts with all post-information:
    println(post1)
    println(post2)
    println(post3)
    println()

    // Sort posts by upvotes:
    val sortedByUpvotes = listOf(post1, post2, post3).sortedByDescending { it.getUpvotes() }
    println("Reddit posts sorted by upvotes = ${sortedByUpvotes.joinToString { it.toString("upvotes") }}")

    // Sort posts by downvotes:
    val sortedByDownvotes = listOf(post1, post2, post3).sortedByDescending { it.getDownvotes() }
    println("Reddit posts sorted by downvotes = ${sortedByDownvotes.joinToString { it.toString("downvotes") }}")
    println()

    println("------- Task 4.5 -------")
    val redditFrontPage = RedditFrontPage()
    redditFrontPage.addNewPost(post1)
    redditFrontPage.addNewPost(post2)
    redditFrontPage.addNewPost(post3)

    println("Reddit Front Page:")
    redditFrontPage.displayAllPosts()

    println()
    println("Displaying post at index 2:")
    redditFrontPage.displaySpecificPost(2)
    println()
    println("Deleting post at index 2...")
    println()
    redditFrontPage.deletePost(2)
    println("\"New\" Reddit Front Page :")
    redditFrontPage.displayAllPosts()
    println()

    println("------- Task 5 -------")
    val fruitList = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana", "kiwi")
    wordFrequency(fruitList)
}

// Task 5, Write a program that takes a list of words as input and prints the frequency of each word.
fun wordFrequency(words: List<String>) {
    val mutableWordMap = mutableMapOf<String, Int>()
    // Check if word is present in map, if present; increment frequency by 1, if not; initialize frequency to 1
    for (word in words) {
        mutableWordMap[word] = (mutableWordMap[word] ?: 0) + 1
    }
    for ((word, frequency) in mutableWordMap) {
        println("$word: $frequency")
    }
}