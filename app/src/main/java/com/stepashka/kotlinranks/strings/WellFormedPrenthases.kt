package com.stepashka.kotlinranks.strings
var resultList = mutableListOf<String>()
fun generateParenthesis(n: Int): List<String> {
    generatePrentases(n * 2, "")
    return resultList

}
private fun generatePrentases(target: Int, current: String){
    if (current.length == target) {
        var open = 0
        var close = 0
        for (i in 0 until current.length) {
            if (current[i] == '(') {
                ++open

            } else {
                ++close
            }
            if (close > open) {
                break
            }
        }
        if (close == open) {
            resultList.add(current)
        }
    }else{
            generatePrentases(target, "${current}(")
            generatePrentases(target, "${current})")

        }
    }

fun main(args: Array<String>){
    println(generateParenthesis(3))
}

