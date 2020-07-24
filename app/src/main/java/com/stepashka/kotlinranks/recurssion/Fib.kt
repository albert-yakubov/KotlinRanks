package com.stepashka.kotlinranks.recurssion

fun Fib(n: Int, a: Long, b: Long) : Long{
    when {
        n==0 -> {
            return b
        }
        n >= 1 -> {
            return Fib(n-1, a + b, a)
        }

    }
    return Fib(n-1, a + b, a)
}

operator fun Any?.plus(other: Any?) {
    return
}


fun main(args: Array<String>) {
    println(Fib(123, 0, 1))
}