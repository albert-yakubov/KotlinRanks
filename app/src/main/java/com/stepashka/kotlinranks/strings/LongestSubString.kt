package com.stepashka.kotlinranks.strings

import kotlin.math.max

fun lengthOfLongestSubstring(s: String): Int{

    val pos = IntArray(256)
    //fills the element from index to index
    pos.fill(-1, 0, pos.size)
    var start = 0
    var result = 0
    // indices returns a character sequence
    for (char in s.indices){
        val index = s[char].toInt()
        if(pos[index] == -1 || pos[index] < start){
            result = max(result, char - start + 1)
        }else{
            start = pos[index] + 1

        }
        pos[index] = char
    }

    return result
}
fun main(args: Array<String>) {
    val string = "abcabcbb"

    val rotations = 2
    val pos = 5
    print(lengthOfLongestSubstring(string))
}