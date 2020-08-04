package com.stepashka.kotlinranks.Ints

fun romanToInt(s: String): Int{
    var firstValue = 0
    var secondValue = 0

    var result = 0
    for (char in s.length - 1 downTo 0){
        val letter = s[char]

        val  value = getValue(letter)
        if (value > firstValue){
            result += value
        }else if (firstValue>= secondValue){
            result -= value
        }else{
            throw Exception("Wrong Number!")
        }
        secondValue = firstValue
        firstValue = value

    }
    return result
}

fun getValue(letter: Char) = when(letter) {
    'I' -> 1
    'V' -> 5
    'X' -> 10
    'L' -> 50
    'C' -> 100
    'D' -> 500
    'M' -> 1000
    else -> throw Exception("Unexpected letter $letter")
}
fun main(array: Array<String>){
    println(romanToInt("MMXX"))
}