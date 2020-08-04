package com.stepashka.kotlinranks.strings

import kotlin.math.max

fun longestPalindrome(s: String) : String{
    if (s.isBlank() || s.length == 1) return s

    var size = s.length
    var start: Int
    var finish: Int
    while (size > 1){
        start = 0
        finish = size - 1
        while (finish < s.length){
            if (isPalindrome(s, start, finish)) return s.substring(start..finish)
            start++
            finish++
        }
        size--
    }
    return s[0].toString()
}
fun isPalindrome(s: String, start: Int, finish: Int) : Boolean{
    var left = start
    var right = finish
    while (left<right) if (s[left++] != s[right--]) return false
    return true
}
fun main(args: Array<String>){

    val testString = "xracecar"
    println(longestPalindrome(testString).toString())
}