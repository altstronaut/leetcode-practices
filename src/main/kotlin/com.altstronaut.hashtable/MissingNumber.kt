package com.altstronaut.hastable

fun missingNumber(nums: IntArray): Int {
    val currentSum = nums.sum()
    val n = nums.size
    val intendedSum = ((n+1)*n)/2
    return intendedSum - currentSum
}

fun main(args: Array<String>) {
    val nums = intArrayOf(0,1,2,3,4,5,6,7,9)
    val result = missingNumber(nums)
    println(result)
}
