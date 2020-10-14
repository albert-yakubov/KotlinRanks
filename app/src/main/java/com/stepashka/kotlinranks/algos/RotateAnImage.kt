package com.stepashka.kotlinranks.algos

fun rotate(matrix: Array<IntArray>): Array<IntArray> {

    val size = matrix.size
    // println(size) // prints 3
    for (firstIndex in 0 until size){
        //println(firstIndex) // prints 0 1 2
        for (secondIndex in firstIndex until size){
            //println(secondIndex) // prints 000 111 222 which are indexes for arrays
            val temp = matrix[secondIndex][firstIndex]
            //println(temp) // this grabs the variables with indexes that were just extracted
            matrix[secondIndex][firstIndex] = matrix[firstIndex][secondIndex]
            matrix[firstIndex][secondIndex] = temp
        }
    }
    matrix.forEach { row->
        row.reverse()
    }
    return matrix

}
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
val mytestcaseforthis = arrayOf(intArrayOf(1,2,3), intArrayOf(4,5,6), intArrayOf(7,8,9))
fun main(args: Array<String>){
    println(rotate(mytestcaseforthis).toString())
}