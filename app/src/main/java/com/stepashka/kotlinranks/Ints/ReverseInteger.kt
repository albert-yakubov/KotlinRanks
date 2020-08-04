package com.stepashka.kotlinranks.Ints

fun reverseInteger(x: Int): Int{
    var reversed:Long = 0
    var x: Int = x
    while (x != 0) {
        val digit = x % 10
        reversed = reversed * 10 + digit
        x /= 10
    }
    if(reversed>Int.MAX_VALUE || reversed<Int.MIN_VALUE) reversed = 0
    return reversed.toInt()
}


fun main(args: Array<String>){
    var c = 9646324351
    var s= c.toString()
    //println(s)
   println(reverseInteger(c.toInt()))
}