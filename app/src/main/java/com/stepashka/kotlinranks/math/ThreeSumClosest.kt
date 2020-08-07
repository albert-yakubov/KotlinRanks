package com.stepashka.kotlinranks.math

fun threeSumClosest(nums: IntArray, target: Int): Int {
        var answer = 0L
        var minimalDifference = Int.MAX_VALUE
        nums.sort()
        for (num in 0..nums.size - 2){
            var num2 = num + 1
            var num3 = nums.size - 1

            while (num2 < num3){
                val tempSum = nums[num] + nums[num2] + nums[num3]
                if(tempSum == target){
                    return tempSum
                }else if (tempSum < target){
                    num2++

                }else{
                    num3 --
                }
                if (minimalDifference> Math.abs(tempSum - target)){
                    minimalDifference = Math.abs(tempSum - target)
                    answer = tempSum.toLong()
                }
            }
        }
        return answer.toInt()
}
fun main(args: Array<String>){
    val myarray = intArrayOf(1,3,4,5,6,3)
    val targetNum = 22
    print(threeSumClosest(myarray, targetNum))
}