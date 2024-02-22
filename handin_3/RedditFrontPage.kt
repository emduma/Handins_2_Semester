package com.example.handin3

import android.os.Build
import androidx.annotation.RequiresApi

// Task 4.5, Write a class: RedditFrontPage:
class RedditFrontPage(private val redditPosts: MutableList<RedditPost> = mutableListOf()) {
    // Add a new post to the front page:
    fun addNewPost(redditPost: RedditPost) {
        redditPosts.add(redditPost)
    }
    // Delete Reddit post from front page if it exists:
    fun deletePost(index: Int) {
        if (index in redditPosts.indices) {
            redditPosts.removeAt(index)
        } else {
            println("Error: Reddit post at index $index not found. Cannot delete post.")
        }
    }
    // Display all Reddit posts (Front page):
    @RequiresApi(Build.VERSION_CODES.O)
    fun displayAllPosts() {
        redditPosts.forEachIndexed { index, post -> println("$index: ${post.toString("default")}") }
    }
    // Display specific Reddit post by its' index number from front page:
    @RequiresApi(Build.VERSION_CODES.O)
    fun displaySpecificPost(index: Int) {
        if (index in redditPosts.indices) {
            println("$index: ${redditPosts[index].toString("default")}\")")
        }
    }
}