package com.altstronaut.hashtable

fun findTheDifference(s: String, t: String): Char {
    var randomLetter = t[t.length - 1]

    for (i in s.indices) {
        randomLetter += t[i].code
        randomLetter -= s[i].code
    }

    return randomLetter
}

fun main(args: Array<String>) {
    val s = "abcd"
    val t = "abcde"
    val result = findTheDifference(s,t)
    println(result)
}
