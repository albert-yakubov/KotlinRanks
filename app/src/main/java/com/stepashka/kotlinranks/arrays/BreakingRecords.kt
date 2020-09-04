package com.stepashka.kotlinranks.arrays

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min_score=scores[0]
    var max_score=scores[0]
    var min_count=0
    var max_count=0
    for (index in scores.indices){
        max_score = if (scores[index]>max_score) scores[index].also {
            max_count++ } else max_score

        min_score = if (scores[index]< min_score) scores[index].also {
            min_count++
        } else min_score
    }

    return arrayOf(max_count, min_count)
}
val myScoresList = arrayOf<Int>(3, 4, 21, 36, 10, 28, 35, 5, 24, 42)

fun main(args: Array<String>){
    println( (breakingRecords(myScoresList).joinToString(" ")))
}
