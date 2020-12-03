package com.stepashka.kotlinranks.algos

data class Show(var name: String, var leadActor: String)

fun main(args: Array<String>) {
    val show = Show("Game of Thrones","Kit Harington")
    val show1 = Show("Game of Thrones","Kit Harington")
    println(show == show1)
    println(show === show1)
}