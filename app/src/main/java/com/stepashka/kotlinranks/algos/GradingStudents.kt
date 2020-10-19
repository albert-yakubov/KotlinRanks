package com.stepashka.kotlinranks.algos

/**
 * accepts an integer array
 * and returns an integer array
 * grades 0 - 100
 * any less than 40 fails
 * round up anything over 3
 * */

fun grade(grades: IntArray){
    var newGrades = mutableListOf<Int>()
    grades.forEach { grade->
        if (grade <= 34){
            newGrades.add(grade)
        }else if (grade % 5 == 3){
            newGrades.add(grade - 3 + 5)
        }else if (grade % 5 == 4){
            newGrades.add(grade - 4 + 5)
        }else{
            newGrades.add(grade)
        }
    }
    print(newGrades)
}
val grades = intArrayOf(73,67,38,33)
fun main(args: Array<String>){
    grade(grades)
}

