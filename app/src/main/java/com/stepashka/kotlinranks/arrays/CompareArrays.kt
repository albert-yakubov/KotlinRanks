package com.stepashka.kotlinranks.arrays

fun compareTriplets(a: Array<Int>, b: Array<Int>): ArrayList<Int> {
    var alicePoints = 0
    var bobPoints = 0
    var players = arrayListOf<Int>()
    (a.indices).forEach { index ->

            when {
                a[index] > b[index] -> {
                    alicePoints++
        //                    players.add(alicePoints)
        //                    players.add(bobPoints)
                }
                a[index] < b[index] -> {
                    bobPoints++

        //                    players.add(bobPoints)
        //                    players.add(alicePoints)

                }
//                else -> {
//                    players.add(alicePoints)
//                    players.add(bobPoints)
//                }
            }

        }

    players.add(alicePoints)
    players.add(bobPoints)
    return players

}
fun main(args: Array<String>){
    var ally = arrayOf(5,6,7)
    var bobby = arrayOf(3,6,10)
    println(compareTriplets(ally,bobby))
}