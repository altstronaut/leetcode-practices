package com.altstronaut.hashtable

fun majorityElement(nums: IntArray): Int {
    var map = mutableMapOf<Int, Int>()
    for (key in nums) {
        map[key] = (map[key] ?: 0) + 1
    }
    val result = map.maxBy {it.value}!!.key
    return result
}

fun main(args: Array<String>) {
    val nums = intArrayOf(2,2,1,1,1,2,2)
    val result = majorityElement(nums)
    println(result)
}
