package com.altstronaut.hashtable

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val magazineList = magazine.toCharArray().toMutableList()
    val ransomNoteArray = ransomNote.toCharArray()

    for(i in ransomNoteArray) {
        if(!magazineList.remove(i)){
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    val ransomNote = "aa"
    val magazine = "ab"
    val result = canConstruct(ransomNote, magazine)
    println(result)
}