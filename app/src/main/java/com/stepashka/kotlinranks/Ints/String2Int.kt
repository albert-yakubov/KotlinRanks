package com.stepashka.kotlinranks.Ints

fun string2Int(str: String): Int {
    var myString = str.trim()
    if (str.isEmpty() || str.trim()[0].isLetter()) return 0

    var endIndex = 0
    for (char in str.indices) {
        var myChar = str[char]
        if (!myChar.isDigit() && char > 0) {
            endIndex = char
            break
        }
    }
    val newStr = if (endIndex > 0) str.substring(0, endIndex) else str
    var myDouble = 0.0
    try {
        myDouble = newStr.toDouble()
    } catch (e: Exception) {

    }
    if (myDouble > Int.MAX_VALUE) return Int.MAX_VALUE
    if (myDouble < Int.MIN_VALUE) return Int.MIN_VALUE
    return myDouble.toInt()

}
fun main(array: Array<String>){
    println(string2Int("-42withwords"))
}