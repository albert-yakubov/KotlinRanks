package com.stepashka.kotlinranks.algos


/*
divide the string into two mirrored parts

a letter in a string can appear an odd or even times

each letter on left must have a pair on right


**/
fun gameOfThrones(s: String): String? {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var first = 0
    var second = 0
    val stringLength = s.length
    for (numberBetweenZeroAndTwentyFife in 0..25) {
        var charIndex = 0
        for (numberBetweenZeroAndStringLenght in 0 until stringLength) {
            if (alphabet[numberBetweenZeroAndTwentyFife] == s[numberBetweenZeroAndStringLenght]) charIndex++
        }
        if (charIndex % 2 == 0) first++ else second++
    }
    return if (first <= 1) "YES" else if (first == 2 && stringLength % 2 == 0) "YES" else "NO"
}

fun main(args: Array<String>){
    gameOfThrones("abcba")
}
