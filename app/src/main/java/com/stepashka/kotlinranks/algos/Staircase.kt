package com.stepashka.kotlinranks.algos

fun staircase(n: Int): Unit {

    // n is an int like 6
    val sb = StringBuilder()
    var num = 1
    val nums = num until n + 1
    var myList = mutableListOf<Int>()
    nums.forEach {
        myList.add(it)
    }





        print("\n${sb}")
        //print("\n${(myNums)}")
        //print("\n${hashSign}")
    }






fun main(args: Array<String>){
    println(staircase(6))
}