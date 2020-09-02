package com.stepashka.kotlinranks.arrays


/***
 * pull all elements
 * and pick the smallest 4
 * and return the sum of those
 * (this solution didnt work because I ran into Long which turns into edge case)
 */

/***
 * If you take the sum of all numbers and subtract the highest num
 * you will get the minimal sum, vise versa for max sum
 */

fun miniMaxSum(arr: Array<Int>): Unit {


    var sumOfAllNumbers = arr.sum()
    //println(sumOfAllNumbers) // 15
    var maxOfAllValues = arr.max()
    //println(maxOfAllValues)  //
    var minValueOfAllNums = arr.min()
    var minSum = sumOfAllNumbers- maxOfAllValues!!
    var maxSum = sumOfAllNumbers - minValueOfAllNums!!
    println("$minSum $maxSum")
    return

}
// 1 + 2 + 3 + 4 = 10

val example: Array<Int> = arrayOf(1, 2, 3, 4, 5)

val myArry: Array<Int> = arrayOf(256741038 ,623958417 ,467905213 ,714532089 ,938071625)
val myArry2: Array<Int> = arrayOf(1, 3, 5, 7, 9)
fun main(args: Array<String>){
    println(miniMaxSum(example))
    println(miniMaxSum(myArry))

}