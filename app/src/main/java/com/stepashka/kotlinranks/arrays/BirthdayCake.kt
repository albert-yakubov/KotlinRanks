package com.stepashka.kotlinranks.arrays

// how many tallest candles can be blown out successfully

// there is an array of candles [ 4,4,2,3]

// the only once that can be blown out are the tallest once which are 4 and 4 which is 2 of em

// so go through the array and find the biggest number and count the instances of that number
fun birthdayCakeCandles(ar: Array<Int>): Int {

    var biggestNumber = ar.max() ?: 0
    var countTheBiggestNumber = 0
    for (number in ar)
        while (number == biggestNumber){
            countTheBiggestNumber += 1
            break
        }

    return countTheBiggestNumber

}
var myTest = arrayOf<Int>(1,2,3,4,4)
fun main(args: Array<String>){
    println(birthdayCakeCandles(myTest))
}