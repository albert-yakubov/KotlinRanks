package com.stepashka.kotlinranks.algos




fun jump(nums: IntArray): Int {
    var size = nums.size
    var tempIndex = 0
    var steps = 0
    var counter = 0
    while (steps < nums.lastIndex) {
        counter++
        if (nums[steps] + steps >= nums.lastIndex) break
        steps = indexOfMaxValue(steps + 1, nums[steps] + steps, nums)
    }
    return counter
}

private fun indexOfMaxValue(start: Int, end: Int, nums: IntArray):Int{
    var max = Int.MIN_VALUE
    var indexOfMax = -1
    for (index in start..end){
        if (nums[index] + index >= max){
            max = nums[index] + index
            indexOfMax = index
        }
    }
    return if(indexOfMax == -1){
        nums.lastIndex
    }else{
        indexOfMax
    }
}

val thiss = intArrayOf(2,3,1,1,4)
fun main(args: Array<String>){
    println(jump(thiss))
}