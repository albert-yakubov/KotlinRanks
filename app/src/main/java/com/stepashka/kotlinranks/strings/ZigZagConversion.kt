package com.stepashka.kotlinranks.strings

import java.lang.StringBuilder

fun convert(s: String, numRows: Int): String {
    if (numRows==1){
        return s
    }

    val array2d = Array(numRows) { Array(s.length, { "" }) }

    var Xindex = 0
    var Yindex = 0
    var add = true
    for (item in s) {
        array2d[Yindex][Xindex] = item.toString()
        if (add) {
            if (Yindex < numRows - 1) {
                Yindex++
            }else{
                Xindex++
                Yindex--
                add = false
            }
        } else {
            if(Yindex>0){
                Yindex--
                Xindex++
            }else{
                Yindex++
                add = true
            }
        }
    }

    // printArray(array2d)

    // println(getString(array2d))
    return getString(array2d)
}

fun getString(array2d: Array<Array<String>>):String{
    var res = ""
    for (a in array2d) {
        for (b in a) {
            if(b != ""){
                res +=b
            }
        }
    }
    return res
}
fun main(args: Array<String>){
    print(convert("POSTMAPISTHEBEST", 2))
}