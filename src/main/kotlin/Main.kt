fun missingNumber(nums: IntArray): Int {
    val currentSum = nums.sum()
    println("current sum: $currentSum")
    val n = nums.size
    println("List size: $n")
    val intendedSum = ((n+1)*n)/2
    println("expected sum $intendedSum")
    return intendedSum - currentSum
}

fun main(args: Array<String>) {
    val nums = intArrayOf(0,1,2,3,4,5,6,7,9)
    val missingNumber = missingNumber(nums)
    println(missingNumber)
}