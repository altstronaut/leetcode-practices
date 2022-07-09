package com.altstronaut.hashtable

fun longestPalindrome(s: String): Int {
    return minOf(
        s.length,
        1 + s.groupingBy { it }.eachCount().map { (k, v) -> (v / 2) * 2 }.sum()
    )
}

fun main(args: Array<String>) {
    val input = "abccccdd"
    val result = longestPalindrome(input)
    println(result)
}
