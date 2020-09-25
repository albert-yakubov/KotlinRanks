package com.stepashka.kotlinranks.algos

fun angryProfessor(k: Int, a: Array<Int>): String {
    var ontime = 0
    var late = 0

    a.forEach {
        if(it >= 1){
            ontime += 1

        }else if (it < 0){
            late += 1
        }
    }
    return if (a.size - ontime>=k){
        "NO"
    }else{
        "YES"
    }
}
var ma = arrayOf<Int>(1,1,1,1,1,1,0,0,-1,-1)
fun main(args: Array<String>){
    print(angryProfessor(6, ma))
}