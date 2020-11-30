package com.stepashka.kotlinranks.algos


/*
divide the string into two mirrored parts

a letter in a string can appear an odd or even times

each letter on left must have a pair on right


**/
fun gameOfThronesTesting(s: String): String? {
    val a = "abcdefghijklmnopqrstuvwxyz"
    var oc = 0
    var ec = 0
    val l = s.length
    for (i in 0..25) {
        var c = 0
        for (j in 0 until l) {
            if (a[i] == s[j]) c++
        }
        if (c % 2 == 0) ec++ else oc++
    }
    return if (oc <= 1) "YES" else if (oc == 2 && l % 2 == 0) "YES" else "NO"
}
fun gameOfThrones(s: String): String {
    var add = 0

    for (char in s.count { })
    println("")
    return ""

}
fun main(args: Array<String>){
    gameOfThrones("abcba")
}
