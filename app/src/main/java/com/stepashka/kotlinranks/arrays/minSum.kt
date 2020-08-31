package com.stepashka.kotlinranks.arrays


/***
 * pull all elements
 * and pick the smallest 4
 * and return the sum of those
 */

fun miniMaxSum(arr: Array<Long>): MutableList<Long> {
    var nums = 0L
    var answers = mutableListOf<Long>()
    arr.sort()
    nums = (arr[0] + arr[1] + arr[2] + arr[3])
    var highNums = arr[1] + arr[2] + arr[3] + arr[4]
    answers.add(nums)
    var fullSum = arr.sum()
    answers.add(highNums)
    return answers


}

val myArry: Array<Long> = arrayOf(256741038 ,623958417 ,467905213 ,714532089 ,938071625)

fun main(args: Array<String>){
    println(miniMaxSum(myArry))
}