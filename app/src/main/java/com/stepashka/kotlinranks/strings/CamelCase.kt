package com.stepashka.kotlinranks.strings

fun camelcase(s: String): Int {
    var letters = s.toCharArray()
    var counter = 1
    letters.forEach { letter->
        if (letter.isUpperCase()){
            counter++
        }

    }
    return counter

}
val camelCaseWords = "thisIsTheSixLetterSentence"

fun main(args: Array<String>){
    println(camelcase(camelCaseWords))
}