package com.stepashka.kotlinranks.math

fun countTriplets(arr: Array<Long>, r: Long): Long {
    var leftMap : HashMap<Long, Int> = HashMap()
    var counter = 0
    for(index in 1 until arr.size - 1){
        if (leftMap.containsKey(arr[index - 1])){
            leftMap[arr[index - 1]] = leftMap.getValue(arr[index -1]) + 1
        }else{
            leftMap[arr[index - 1]] = 1
        }
        var right = 0
        for(index2 in index + 1 until arr.size){
            if (arr[index2] == arr[index] * r){
                right++
            }
        }
        if (leftMap[arr[index]/r] != null){
            counter +=(leftMap[arr[index]/r])!!.toInt() * right
        }
    }



    return counter.toLong()
}

val thisTC = arrayOf(1L, 3L, 9L, 9L, 27L, 81L)
fun main(args: Array<String>){
    countTriplets(thisTC, 3)
}