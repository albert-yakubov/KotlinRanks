package com.stepashka.kotlinranks.algos

import java.lang.StringBuilder

fun staircase(n: Int): Unit {

    var space  = " "
    fun repeatStringNumTimes(str: String, num: Int) : String {
        return if (num > 0){
            str.repeat(num)
        }else{
            ""
        }
    }
    var result = ""
    val hash = '#'
    for (num in 1..n) {
        result = repeatStringNumTimes("#", num)
        println("${space.repeat(n-num)}$result")

    }


}







fun main(args: Array<String>){

    staircase(6)
}