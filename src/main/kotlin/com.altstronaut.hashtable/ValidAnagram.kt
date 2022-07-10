package com.altstronaut.hashtable

fun isAnagram(s: String, t: String): Boolean {
    return s.groupingBy { it }.eachCount() == t.groupingBy { it }.eachCount()
}

fun main(args: Array<String>) {
    val firstWord = "anagram"
    val secondWord = "nagarame"
    val result = isAnagram(firstWord, secondWord)
    println(result)
}