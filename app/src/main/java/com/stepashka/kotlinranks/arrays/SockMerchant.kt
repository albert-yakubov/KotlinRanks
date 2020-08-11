package com.stepashka.kotlinranks.arrays

fun sockMerchant(n: Int, arr: IntArray):Int{
    var colors = hashSetOf<Int>()
    var pairs = 0
    for (num in arr.indices){
        if (!colors.contains(arr[num])){
            colors.add(arr[num])
        }else{
            pairs++
            colors.remove(arr[num])

        }
    }
    return pairs
}

fun main(args: Array<String>){
    println(sockMerchant(11, intArrayOf(1,2,3,3,1,2,3,1,3,1,2,3,1,2,3,1)))
}