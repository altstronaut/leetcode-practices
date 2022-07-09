package com.altstronaut.hashtable

fun containsDuplicate(nums: IntArray): Boolean {
    val uniqueNumbers = mutableSetOf<Int>()
    for (i in nums.indices) {
        if(uniqueNumbers.contains(nums[i])) {
            return true
        }
        uniqueNumbers.add(nums[i])
    }
    return false
}

fun main(args: Array<String>) {
    val nums = intArrayOf(1,1,1,3,3,4,3,2,4,2)
    val result = containsDuplicate(nums)
    println(result)
}