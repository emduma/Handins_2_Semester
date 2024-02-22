package com.example.handin3

// Task 1, Write a class: Article
class Article(private val author: String,
              private val title: String) {
    override fun toString(): String {
        return "Article title is; \"$title\", by author; $author."
    }

}