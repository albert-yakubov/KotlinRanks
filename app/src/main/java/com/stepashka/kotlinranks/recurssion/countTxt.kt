package com.stepashka.kotlinranks.recurssion


fun countTxt(dir: Int): Int{
    if(dir == null){
        return 0
    }
    var count = 0
    for (file in iterator<Int> { dir } ){
        if (file >= 0){
            count++
        }
    }
    for (subdir in iterator<Int> { dir }){
        count += countTxt(dir)
    }
    return count
}

fun main(args: Array<String>) {
    println(countTxt(123))
}