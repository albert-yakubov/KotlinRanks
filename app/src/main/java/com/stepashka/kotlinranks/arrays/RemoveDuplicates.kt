package com.stepashka.kotlinranks.arrays

fun removeDuplicates(nums: IntArray): Int {
    var length = 0

    if (nums.isEmpty()){
        return length
    }else{
        var value = nums[length]
        nums.forEachIndexed { index, num ->
            if (value != num){
                nums[++length] = num
                value = num
            }
        }
        length + 1
    }
    return length

}
var testingthis = intArrayOf(1, 1, 2)
fun main(args: Array<String>){
    println(removeDuplicates(testingthis))
}