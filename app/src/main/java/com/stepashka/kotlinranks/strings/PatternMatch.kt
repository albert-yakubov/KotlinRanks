package com.stepashka.kotlinranks.strings

fun isMatch(s: String, p: String) =Regex("^$p\$").matches(s)


fun main(args: Array<String>){
    val string = "mississipi"
    val pattern = "mis*is*ip*i"
    print(isMatch(string, pattern))
}