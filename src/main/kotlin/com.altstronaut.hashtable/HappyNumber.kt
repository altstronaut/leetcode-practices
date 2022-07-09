package com.altstronaut.hashtable

fun isHappy(n: Int): Boolean {
    var myNum = n
    val set = mutableSetOf<Int>()
    while (!set.contains(myNum) && myNum != 1) {
        set.add(myNum)
        val digits = myNum.toDigits()
        var sum = 0
        digits.forEach {
            sum = sum + (it * it)
        }
        myNum = sum
    }
    return myNum == 1
}

fun Int.toDigits(): List<Int> = toString().map { it.toString().toInt() }

fun main(args: Array<String>) {
    val num = 19
    val result = isHappy(num)
    println(result)
}
