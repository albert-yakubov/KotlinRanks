package com.stepashka.kotlinranks.math

fun threeSum(nums: IntArray): List<List<Int>> {
    var a = 0
    var b = 0
    var c = 0
    //base
    if (nums.size < 3) return listOf()
    var answers = mutableSetOf<List<Int>>()
    nums.sort()
    nums.forEachIndexed{ index, num ->
        val target = num * -1
        val twoSum = mutableListOf<IntArray>()
        val filteredNumbers = nums.filterIndexed{ index2, _ -> index2 != index}
        var start = 0
        var end = filteredNumbers.size -1
        while (start < end){
            val sum = filteredNumbers[start] + filteredNumbers[end]

            when{
                sum == target -> {
                    twoSum.add(intArrayOf(filteredNumbers[start], filteredNumbers[end]))
                    start++
                }
                sum < target -> start++
                else -> end--
            }
        }
        twoSum.forEach{ intArray ->
            answers.add(listOf(num, intArray[0], intArray[1]).sorted())
        }

    }
    return answers.toList()
}
var mynums: IntArray = intArrayOf(-1, 0, 1, 2, -1, -4)
fun main(args: Array<String>){

    print(threeSum(mynums))
}