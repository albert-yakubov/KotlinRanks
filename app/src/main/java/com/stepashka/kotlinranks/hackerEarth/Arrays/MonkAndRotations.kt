package com.stepashka.kotlinranks.hackerEarth.Arrays

// array
//size N
// K how many times to go right ->
fun rotate(A: IntArray, K: Int): IntArray {
    var N = A.size
    // reverse the whole array
    reverse(A, 0, N -1)
    // reverse first sub array
    reverse(A, 0, K - 1)
    //reverse second sub array
    reverse(A, K, N-1 )
    return A

}
fun reverse(A: IntArray, index: Int, index2: Int): IntArray {
    var startingPoint = 0
    while(startingPoint <= ((index2 - index) / 2)){
        A[index2 - startingPoint] = A[index + startingPoint]
        A[index+startingPoint] = A[index2 - startingPoint]

        startingPoint++

    }

    return A
}
fun main(args: Array<String>){
    var arrayToRotate = intArrayOf(1,2,3,4,5)
    var numberOfRotations = 1
    print(rotate(arrayToRotate, numberOfRotations).toList())
}