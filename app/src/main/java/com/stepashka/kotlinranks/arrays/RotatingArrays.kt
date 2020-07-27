package com.stepashka.kotlinranks.arrays

//# d is ammount of rotations
//# a is array
//# n are the numbers starting rotation from
//
//# Function to left rotate arr[] of size n by d*/

fun rotate(myArray: MutableList<Int>, rotations: Int, position: Int) : MutableList<Int> {
    for (number in 0.until(rotations)){
        rotateByOne(myArray, position)
    }
    return myArray
}
fun rotateByOne(myArray: MutableList<Int>, position: Int) {
    var tempNumber = myArray[0]
    for (number in position.until(position - 1)) {
        myArray[number] = myArray[number + 1]

        myArray[number - 1] = tempNumber

    }
}
fun main(args: Array<String>) {
    val arr = mutableListOf(1,2,3,4,5)

    val rotations = 2
    val pos = 5
    print(rotate(arr, rotations, pos))
    print(arr)
}
