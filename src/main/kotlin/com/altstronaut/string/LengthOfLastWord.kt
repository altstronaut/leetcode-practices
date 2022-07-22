package com.altstronaut.string

fun lengthOfLastWord(s: String): Int {
    var length = 0;
    for(i: Int in s.length.dec() downTo 0) {
        if(s[i] == ' ') {
            if(length == 0) continue
            else break
        }
        length++
    }
    return length
}

fun main(args: Array<String>) {
    var s = "Hello World"
    var result = lengthOfLastWord(s)
    println(result)
}