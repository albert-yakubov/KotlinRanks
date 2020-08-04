package com.stepashka.kotlinranks.arrays

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    var middle = mutableListOf<Int>()
    var temp = mutableListOf<Double>()
    var number = 0.0
    var number2 = 0.0
    for (num in nums1.iterator()){
        if (nums1.isNotEmpty()) {
            middle.addAll(0, listOf(num))
        }else{
            middle.add(0)
        }
        }
    for (num in nums2.iterator()){
        if (nums2.isNotEmpty()){
            middle.addAll(0, listOf(num))
        }else{
            middle.add(0)
        }

    }
    middle.sort()
    if (middle.size % 2 == 1){
        number = (middle[middle.size /2]).toDouble()
        number2 = (middle[middle.size /2]).toDouble()
        temp.add((middle[middle.size /2]).toDouble())
        println(number)
        println("true")
    }else{
        number =(middle[middle.size /2 - 1]).toDouble()
        number2 = (middle[middle.size /2 ]).toDouble()
        temp.add((middle[middle.size /2 + 1]).toDouble() )
        println(number + number2)
        println(":$number:")
    }
    return (number + number2) / 2
}
fun main(args: Array<String>) {
    val intArray = intArrayOf(1,2)
    val intArray2 = intArrayOf(3,4)
    print(findMedianSortedArrays(intArray,intArray2))
}