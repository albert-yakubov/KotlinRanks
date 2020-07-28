package com.stepashka.kotlinranks.math

import java.lang.NullPointerException

fun ConsecutiveCombos(myArray: IntArray, target: Int) : Int{
    var counter = 0
    if(myArray == null) {
        return 0
    }
    for(number in myArray) {
        var sum = 0
        for (num2 in myArray) {
            sum += myArray[num2]
            if (sum < target) {
                counter++
            } else {
                break
            }
        }
    }
        return counter
}

//optimized version:

fun ConsecutiveCombosOptimized(myArray: IntArray, target: Int) : Int {
    var sum = myArray[0]
    var startIndex = 0
    var endIndex = 0
    var counter = 0
    if(myArray == null) {
        return 0
    }
    while (startIndex < myArray.size && endIndex < myArray.size) {
        if (sum < target) {
            endIndex++

            // this just makes sure that we are not messing up the count of an array (kind of an edge case so we dont end up on backwards index)
            if (endIndex >= startIndex){
                counter = counter + (endIndex - startIndex)
            }
            if (endIndex < myArray.size){
                sum = sum + myArray[endIndex]
            }

        } else {

            sum = sum - myArray[startIndex]
            startIndex++
        }
    }
    return counter
}