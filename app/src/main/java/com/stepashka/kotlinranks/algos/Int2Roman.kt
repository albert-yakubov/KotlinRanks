package com.stepashka.kotlinranks.algos

fun Int2Roman(n: Int): String {

    val m = listOf<String>("", "M", "MM", "MMM")

    val c = listOf<String>("", "C", "CC", "CCC", "CD", "D",
        "DC", "DCC", "DCCC", "CM")

    val x = listOf<String>("", "X", "XX", "XXX", "XL", "L",
        "LX", "LXX", "LXXX", "XC")

    val i = listOf<String>("", "I", "II", "III", "IV", "V",
        "VI", "VII", "VIII", "IX")

    var thousands = m[n/1000]
    var hundreds = c[(n%1000)/100]
    var tens = x[(n%100)/10]
    var ones = i[n%10]

    var answers = thousands + hundreds + tens + ones

    return answers
}
fun main(args: Array<String>) {
    print(Int2Roman(2020))
}