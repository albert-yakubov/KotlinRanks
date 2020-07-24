package com.stepashka.kotlinranks.arrays

import com.stepashka.kotlinranks.math.testNumbers

fun countSwaps(a: MutableList<Int>?): Int{
    var intArray = mutableListOf<Int>(1,2,3,4,5,6) ?: mutableListOf(1,2,3,4,5,6,7)
    var numberOfSwaps = 0
    var firstElement = intArray.first()
    var lastElement = intArray.lastIndex

    while (true){
        var swap = false
        for (number in 0 until a!!.size - 1){
            val currentIndex = number + 1
            if (a[number] > a[currentIndex]){
                var lowest = a[currentIndex]
                var highest = a[number]

                a[number] = lowest
                a[currentIndex] = highest

                numberOfSwaps++
                swap = true
            }

        }
        if (!swap){
            break
        }
    }
    println("Array is sorted in' $numberOfSwaps swaps.")
    println("First Element: ${testNumbers[0]}")
    println("Last Element: ${testNumbers.lastIndex} \n")
    return numberOfSwaps


}

fun main(args: Array<String>) {
    var testNumbers = mutableListOf<Int>(3,2,4,1,5,6)
    println(countSwaps(testNumbers))
    println(testNumbers)
}