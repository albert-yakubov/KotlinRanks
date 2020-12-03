package com.stepashka.kotlinranks.algos

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter

fun main() {
    var str: String? = "BETSOL"

    var newStr = str?: "LLC"

    println(newStr);

    str = null

    newStr = str?: "BETSOL LLC"

    println(newStr);

}
public class Temp(x: Int = 5, y: Int = this.y) {
    companion object {
        private const val x = 10
        private const val y = 10
        @JvmStatic
        fun main(args: Array<String>) {
            val t = Temp()
        }
    }

    init {
        println(x * y)
    }
}
object TestClass {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val wr = PrintWriter(System.out)
        val A_size: Int = br.readLine().trim().toInt()
        val arr_A: List<String> = br.readLine().trim().split(" ")
        val A = IntArray(A_size)
        for (i_A in arr_A.indices) {
            A[i_A] = arr_A[i_A].toInt()
        }
        val K_Array_size: Int = br.readLine().trim().toInt()
        val K_Array = IntArray(K_Array_size)
        for (i_K_Array in 0 until K_Array_size) {
            K_Array[i_K_Array] = br.readLine().trim().toInt()
        }
        val out_ = process_queries(A, K_Array, A_size, K_Array_size)
        for (i_out_ in out_.indices) {
            wr.println(out_[i_out_])
        }
        wr.close()
        br.close()
    }

    fun process_queries(A: IntArray, K_Array: IntArray?, N: Int, K: Int): IntArray {
        // Write your code here
        var count = 0
        var tempList = K_Array?.toMutableList()
        for (num in A) {
            if (num >= K) {
                count++
                tempList!!.add(count)
                return tempList.toIntArray()
            }
            return tempList!!.toIntArray()
        }
        return tempList!!.toIntArray()
    }
}