package com.stepashka.kotlinranks.math

fun miniMaxSum(arr: Array<Int>): Unit {
    arr.sort()
    var min  = (arr[0]).toLong() +  (arr[1 ]).toLong()+( arr[2]).toLong() + (arr[3]).toLong()
    var max =( arr[arr.size - 4]).toLong() + (arr[arr.size -3]).toLong() + (arr[arr.size - 2]).toLong() + (arr[arr.size -1]).toLong()
    print("$min $max")
}
val array4this = arrayOf<Int>(1,2,3,4,5)
fun main(args: Array<String>){
    miniMaxSum(array4this)
}