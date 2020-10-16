package com.stepashka.kotlinranks.algos

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    var numberOfPrisoners = n
    var numberOfCandy = m
    var startingPoint = s

    var listOfPrisoners = mutableListOf<Int>()
    for(prisoner in 1..numberOfPrisoners){
        listOfPrisoners.add(prisoner)
    }
    var last = ((m - 1) + (s - 1)) % n + 1
    return last
}
fun main(args: Array<String>){
    print(saveThePrisoner(4,6,2))
}