package com.stepashka.kotlinranks.arrays

fun candy(n: Int, arr: MutableList<Int>) : Long{
    var total = 0
    var candy = 1
    var newArray = mutableListOf(arr.size + 1)

    //set all variables to 1

    for (newNumber in 0 until n) {
        newArray[newNumber] = 1


        // if first child has better score then he gets more candy
        for (child in 0 until arr.size) {
            if (arr[child] >= arr[child]) {
                total = child + candy
                newArray.add(total)

            }
        }
    }

    return sumArray(newArray.toIntArray()).toLong()

}
fun sumArray(array: IntArray): Int{
    var sum = 0
    for(number in array){
        sum += number
    }
    return sum
}
var myArray = intArrayOf(1, 2, 1, 2, 3, 1)
fun main(args: Array<String>) {
    println(candy(1, myArray.toMutableList()))
}