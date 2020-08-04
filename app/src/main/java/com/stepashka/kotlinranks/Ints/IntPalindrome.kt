package com.stepashka.kotlinranks.Ints

import com.stepashka.kotlinranks.strings.isPalindrome

fun isIntpalindrome(x: Int): Boolean{
    var str = x.toString()

    var size = str.length
    var start: Int
    var finish: Int

    if (size > 0){
        start = 0
        finish = size - 1
        while (finish < str.length){
            if (isPalindrome(str, start, finish)) return true
            start++
            finish++
        }
        size--
    }
    return false
}
fun isPalindrome(s: String, start: Int, finish: Int) : Boolean{
    var left = start
    var right = finish
    while (left<right) if (s[left++] != s[right--]) return false
    return true
}
fun main(args: Array<String>){
    print(isIntpalindrome(-121))
}