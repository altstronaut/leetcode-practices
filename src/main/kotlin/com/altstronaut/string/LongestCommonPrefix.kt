package com.altstronaut.string

fun longestCommonPrefix(strs: Array<String>): String {
    return strs.reduce{accumulator, string -> accumulator.commonPrefixWith(string)}.orEmpty()
}

fun main(args: Array<String>) {
    val aWords = arrayOf<String>("flower","flow","flight")
    val result = longestCommonPrefix(aWords)
    println(result)
}