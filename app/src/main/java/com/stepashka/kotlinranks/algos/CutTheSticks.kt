package com.stepashka.kotlinranks.algos

fun cutTheSticks(arr: Array<Int>): MutableList<Int> {


    var collectionOfCutSticks = ArrayList<Int>()
    var sizeOfanArray = arr.size
    var lowestValue = 0

    while (arr.sum() > 0) {
        arr.sortDescending()
        lowestValue = arr[sizeOfanArray - 1]
        collectionOfCutSticks.add(lowestValue)

        sizeOfanArray = 0
        for (index in arr.indices) {
            if (arr[index] == 0) {
                break
            } else {
                arr[index] -= lowestValue
                sizeOfanArray += if (arr[index] == 0) 0 else 1
            }
        }
    }
    return  collectionOfCutSticks
}

var mytestingarray = arrayOf(5,4 ,4 ,2 ,2 ,8)

fun main(args: Array<String>){
    println(cutTheSticks(mytestingarray))
}
