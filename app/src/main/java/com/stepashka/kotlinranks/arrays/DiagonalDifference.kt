package com.stepashka.kotlinranks.arrays

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var myArray = mutableListOf<Int>()
    var myArray2= mutableListOf<Int>()
    var myArray3= mutableListOf<Int>()
        arr[0].forEach {
            myArray.add(it)
        }
        arr[arr.size / 2].forEach {
            myArray2.add(it)
        }
        arr[arr.size - 1].forEach {
            myArray3.add(it)
        }
    val firstSum = myArray.first() + myArray2[myArray2.size / 2] + myArray3.last()
    val secondSum = myArray.last() + myArray2[myArray2.size / 2] + myArray3.first()
    if (firstSum > secondSum){
        return firstSum - secondSum
    }else{
        return secondSum - firstSum
    }

}
var testArray = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))

fun main(args: Array<String>){
    println(diagonalDifference(testArray))
}
/*
1 2 3     indexes  0 1 2
4 5 6              3 4 5
7 8 9              6 7 8

* **/