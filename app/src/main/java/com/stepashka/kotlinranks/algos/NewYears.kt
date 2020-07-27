package com.stepashka.kotlinranks.algos

import kotlin.math.max

fun minBribes(query: MutableList<Int>) : Int {
    var moves = 0
    var flag = 0
    var string = "Too Chaotic"
    //var value = query.indices
    //var bribes = mutableListOf<Int>()
    for (position in query.indices) {
        for (value in query.indices) {
            if ((value - 1) - position > 2) {
                flag = 1
            }
            val tempNumber = max(0, value -2)
            val breakTheNumber = tempNumber.until(position)

            for (bribe in breakTheNumber){

                    if (query[bribe] > value){
                        moves += 1
                    }



            }
        }
    }
    return moves
}
var q = mutableListOf(1, 2, 3, 4)
fun main(args: Array<String>) {
    print(minBribes(q))
}