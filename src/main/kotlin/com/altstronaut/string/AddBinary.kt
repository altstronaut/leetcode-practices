package com.altstronaut.string

fun addBinary(a: String, b: String): String {
    var sb = StringBuilder()
    var carry = 0
    var (i,j) = a.length-1 to b.length-1

    while(i>=0 || j >=0 || carry > 0) {

        if(i>=0) carry+=a[i--]-'0'
        if(j>=0) carry+=b[j--]-'0'

        sb.append(carry%2)
        carry/=2
    }

    return sb.reversed().toString()
}

fun main(args: Array<String>) {
    val a = "11"
    val b = "1"
    val result = addBinary(a, b)
    println(result)
}