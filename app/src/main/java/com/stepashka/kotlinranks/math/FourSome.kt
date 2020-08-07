package com.stepashka.kotlinranks.math

import com.stepashka.kotlinranks.arrays.myArray

fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    var answers = mutableListOf<List<Int>>()
    nums.sort()
    nums.forEachIndexed { index, num ->
            var muteList = mutableListOf<Int>()
            var num1 = nums[index]
            var num2 = nums[1]
            var num3 = nums[2]
            var num4 = nums.size - 1
           // while (index > nums.size - 1) {

                if (nums[num1] + nums[num2] + nums[num3] + nums[num4] == target && index == nums.size -1) {
                    muteList.add(num1)
                    muteList.add(num2)
                    muteList.add(num3)
                    muteList.add(num4)
                    answers.add(muteList.toList())
                } else {
                    num4--
                }
            }

    //}
    return answers.toList()
}
fun main(args: Array<String>) {
    val myarray = intArrayOf(1, 3, 4, 5, 6, 3)
    val targetNum = 12
    print(fourSum(myarray, targetNum))
}