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