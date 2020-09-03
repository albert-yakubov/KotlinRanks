package com.stepashka.kotlinranks.math

import android.icu.text.DecimalFormat
import java.math.BigDecimal
import java.math.RoundingMode

fun plusMinus(arr: Array<Int>): MutableList<String> {
    var positiveCount = 0
    var negativeCount = 0
    var zeros = 0
    var posVolume = 0f
    var negVolume = 0f
    var zeroVolume = 0f

    var posVolumeStr = ""
    var negVolumeStr = ""
    var zeroVolumeStr = ""
    var results = mutableListOf<String>()
    for(num in arr){

        when {
            num > 0 -> {
                positiveCount += 1
                posVolumeStr = String.format ("%.6f", positiveCount.toFloat()/ (arr.size).toFloat())

            }
            num < 0 -> {
                negativeCount += 1
                negVolumeStr = String.format ("%.6f", negativeCount.toFloat() /( arr.size).toFloat() )

            }
            num == 0 -> {
                zeros+=1
                zeroVolumeStr = String.format ("%.6f", zeros.toFloat() /( arr.size).toFloat() )


            }


        }

        if (posVolumeStr == "" || negVolumeStr == "" || zeroVolumeStr == "") {
            posVolumeStr = "0.000000"
            negVolumeStr = "0.000000"
            zeroVolumeStr = "0.000000"
        }




    }

    results.add(posVolumeStr)
    results.add(negVolumeStr)
    results.add(zeroVolumeStr)

    return results


}
var testCase = arrayOf<Int>(0 ,4, -3, 3, -6)
fun main(args: Array<String>){
    println(plusMinus(testCase))
    println("%.6f".format(1f/4f).toFloat())
}
