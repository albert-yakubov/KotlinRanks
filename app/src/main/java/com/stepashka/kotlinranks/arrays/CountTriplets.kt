package com.stepashka.kotlinranks.arrays

import java.math.BigInteger

// HashMap<key, value> or HashMap<K, V>.
fun countTriplets(arr: Array<Long>, r: Long): BigInteger {
    var count = 0L
    for (firstIndex in arr.indices){
        for (secondIndex in (firstIndex + 1) until arr.size){
            for (thirdIndex in (secondIndex + 1) until arr.size){
                if ((arr[firstIndex]).toBigInteger() * (r).toBigInteger() == (arr[secondIndex]).toBigInteger() &&( arr[secondIndex]).toBigInteger() *( r).toBigInteger() == (arr[thirdIndex]).toBigInteger()){
                    count++
                }
            }
        }
    }
    return count.toBigInteger()
}
var arrrr = arrayOf(1L,4L,16L,64L)
var rr = 4L
fun main(args: Array<String>){
    println(countTriplets(arrrr, rr))
}