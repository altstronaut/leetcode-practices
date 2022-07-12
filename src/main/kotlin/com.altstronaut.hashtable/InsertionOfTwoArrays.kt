package com.altstronaut.hashtable

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    return nums2
        .filter{it->
            nums1
                .contains(it)
        }
        .distinct()
        .toIntArray()
}

fun main(args: Array<String>) {
    val nums1 = intArrayOf(4,9,5)
    val nums2 = intArrayOf(9,4,9,8,4)
    val result = intersection(nums1, nums2)
    result.forEach { num -> System.out.println(num) }
}