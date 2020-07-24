package com.stepashka.kotlinranks.math

import com.stepashka.kotlinranks.algos.Int2Roman

fun CombinationSum(intArray: MutableList<Int>, target: Int): MutableList<MutableList<Int>> {
    var answers = mutableListOf<Int>()
    var final = mutableListOf<Int>()
    var possibilities = mutableListOf(final)
    for (num in intArray) {
        answers.add(num)
        for (num2 in answers) {
            if (num + num2 == target) {
                final.add(num)
                final.add(num2)
                possibilities.add(final)
            }
            possibilities.reverse()
        }
    }
        return possibilities


}

fun CombinationSum2(intArray: MutableList<Int>, target: Int): MutableList<Int> {
    var answers = mutableListOf<Int>()
    var final = mutableListOf<Int>()
    var possibilities = mutableListOf(final)
    for (num in intArray) {
        answers.add(num)
        for (num2 in answers) {
            if (num + num2 == target) {
                final.add(num)
                final.add(num2)
                possibilities.add(final)
            }
            final.reverse()
        }
    }
    return final


}
var testNumbers = mutableListOf<Int>(1,2,3,4,5,6)

fun main(args: Array<String>) {
    print(CombinationSum(testNumbers, 9))
    print(CombinationSum2(testNumbers, 9))

}

