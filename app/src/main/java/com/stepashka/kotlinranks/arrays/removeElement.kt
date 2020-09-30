package com.stepashka.kotlinranks.arrays

fun removeElement(nums: IntArray, `val`: Int): Int {
    val newArray = mutableListOf<Int>()
    nums.forEach{
        while (it != `val`){
            newArray.add(it)
            break
        }
    }
    return newArray.size
}

val thisarray = intArrayOf(2,3,4,5,3,2)

fun main(args: Array<String>){
    print(removeElement(thisarray, 2))
}