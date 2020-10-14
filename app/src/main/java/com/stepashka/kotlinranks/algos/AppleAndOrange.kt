package com.stepashka.kotlinranks.algos

import com.stepashka.kotlinranks.recurssion.countTxt

/**
 * how many fruits will fall on the house
 * S is starting point of the house
 * T is ending point of the house
 * A is Apple tree
 * B is orange tree
 * apples are the once that hit the ground
 * oranges are the same
 */

// first approach:
// say the house at 5 - 10
// may be a line for reference:  _______ in form of an array?
// location of the trees 2 and 12

// how about doing the apples first and seeing the output
// lets follow the first apple

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // lets follow the first apple
    // may be a line for reference:  _______ in form of an array?
    var land = mutableListOf<Int>()
    var countApples = 0
    var countOranges = 0
    // place the house on the line
    for (i in s..t){

        apples.forEach { apple->
            if (a + apple == i) {

                countApples++
            }


        }
        oranges.forEach {
            if (b + it == i){
                countOranges++

            }

        }

    }


print("$countApples\n$countOranges")

}
fun countApplesAndOrangesAgian(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var applesCount = 0
    var orangesCount = 0
    for(fruit in apples){
        if(a+fruit in s..t)
            applesCount++
    }
    for(fruit in oranges){
        if(b+fruit in s..t)
            orangesCount++
    }
    println("$applesCount\n$orangesCount")

}

fun main(args: Array<String>){
    countApplesAndOranges(5, 10, 2, 12, arrayOf(2,3,-4), arrayOf(3,-2, -4))
    countApplesAndOrangesAgian(5,10,2,12, arrayOf(2,3,-4), arrayOf(3,-2, -4))
}