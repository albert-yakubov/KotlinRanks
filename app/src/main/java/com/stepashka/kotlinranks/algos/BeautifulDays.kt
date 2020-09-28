package com.stepashka.kotlinranks.algos

fun beautifulDays(i: Int, j: Int, k: Int) : Int {
    var count = 0
    (i..j).forEach() {
        val diff = it - it.toString().reversed().toInt()
        if (diff % k == 0) {
            count++
        }
    }

        return count

    }
    fun checkModulo(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun addToListReversed(num1: Int, num2: Int): MutableList<Int> {
        var numsRangeReversed = mutableListOf<Int>()
        for (numReversed in num1..num2) {
            numsRangeReversed.add(numReversed.toString().reversed().toInt())
        }
        return numsRangeReversed
    }

    //print(differences)
    fun addToList(num1: Int, num2: Int): MutableList<Int> {
        var numRanges = mutableListOf<Int>()
        for (num in num1..num2) {
            numRanges.add(num)
        }
        return numRanges
    }


fun main(args: Array<String>){
    print(beautifulDays(20,23, 6))
}
