package com.altstronaut.hashtable

fun isIsomorphic(s: String, t: String): Boolean {
    if(s.toSet().size != t.toSet().size) return false
    val map = mutableMapOf<Char, Char>()
    for(i in 0 until s.length) {
        if(!map.containsKey(s[i])) {
            map[s[i]] = t[i]
        } else if (map[s[i]] != t[i]){
            return false
        }
    }
    return true
}

fun main(args: Array<String>){
    val firstWord = "egg"
    val secondWord = "add"
    val result = isIsomorphic(firstWord, secondWord)
    println(result)
}
