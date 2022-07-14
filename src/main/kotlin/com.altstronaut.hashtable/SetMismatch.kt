package com.altstronaut.hashtable

fun findErrorNums(nums: IntArray): IntArray {
    val duplicateNumber = nums.groupBy { it }.filter { it.value.size == 2 }.map { it.key }.first()
    val missingNumber = (1..nums.size).sum() - nums.sum() + duplicateNumber
    return intArrayOf(duplicateNumber, missingNumber)
}

fun main(args: Array<String>) {
    val nums = intArrayOf(1,2,2,4)
    val result = findErrorNums(nums)
    result.forEach { System.out.println(it) }
}