package com.stepashka.kotlinranks.Ints
// using indexes instead of hashmaps
fun IntToRoman(num: Int): String{
    var stringNumber = num.toString()
    var size = stringNumber.length - 1

    val m = arrayOf("", "M", "MM", "MMM")
    val c = arrayOf(
        "", "C", "CC", "CCC", "CD", "D",
        "DC", "DCC", "DCCC", "CM"
    )
    val x = arrayOf(
        "", "X", "XX", "XXX", "XL", "L",
        "LX", "LXX", "LXXX", "XC"
    )
    val i = arrayOf(
        "", "I", "II", "III", "IV", "V",
        "VI", "VII", "VIII", "IX"
    )
    val thousands = m[num / 1000]
    println(thousands)

    val hundereds = c[num % 1000 / 100]
    println(hundereds)

    val tens = x[num % 100 / 10]
    println(tens)

    val ones = i[num % 10]
    println(ones)

    return thousands + hundereds + tens + ones
}

fun main(args: Array<String>){
    println(IntToRoman(2020))
    println(IntToRoman(1986))
    println(IntToRoman(2012))

}