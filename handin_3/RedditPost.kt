package com.example.handin3

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

// Task 4, Write a class: RedditPost
class RedditPost(private val author: String,
                 private val title : String,
                 private var upvotes: Int = 0,
                 private var downvotes : Int = 0) : Comparable<RedditPost> {

    @RequiresApi(Build.VERSION_CODES.O)
    private val postDate: LocalDate = LocalDate.now()
    fun getTitle(): String = title
    fun getAuthor(): String = author
    fun getUpvotes(): Int = upvotes
    fun getDownvotes(): Int = downvotes
    @RequiresApi(Build.VERSION_CODES.O)
    fun getPostDate(): LocalDate = postDate

    fun upvote() {
        this.upvotes++}
    fun downvote() {
        this.downvotes++}

    override fun compareTo(other: RedditPost): Int {
        val voteBalance = (upvotes - downvotes).compareTo(other.upvotes - other.downvotes)
         return if (voteBalance == 0) {
             upvotes.compareTo(other.upvotes)
         } else {
             voteBalance
         }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun toString(): String {
        return toString("default")
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun toString(sortingCriteria: String): String {
        return when (sortingCriteria) {
            "upvotes" -> "Title: \"$title\" - Upvotes: $upvotes"
            "downvotes" -> "Title: \"$title\" - Downvotes: $downvotes"
            else -> "Title: \"$title\" - Author: $author - Upvotes: $upvotes - Downvotes: $downvotes - Date posted: $postDate"
        }
    }
}