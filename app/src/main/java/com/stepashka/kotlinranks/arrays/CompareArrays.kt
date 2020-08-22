package com.stepashka.kotlinranks.arrays

fun compareTriplets(a: Array<Int>, b: Array<Int>): ArrayList<Int> {
    var alicePoints =0
    var bobPoints = 0
    var players = arrayListOf<Int>()
    for(alice in a.indices){
        for (bob in b.indices){
            when {
                a[alice] > b[bob] -> {
                    alicePoints++
                    players.add(alicePoints)
                    players.add(bobPoints)
                }
                a[alice] < b[bob] -> {
                    bobPoints++
                    players.add(bobPoints)
                    players.add(alicePoints)

                }
                else -> {
                    players.add(alicePoints)
                    players.add(bobPoints)
                }
            }
            return players
        }
    }
    return players

}
fun main(args: Array<String>){
    var ally = arrayOf(5,6,7)
    var bobby = arrayOf(3,6,10)
    println(compareTriplets(ally,bobby))
}