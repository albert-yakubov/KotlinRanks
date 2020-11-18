package com.stepashka.kotlinranks.strings

fun contains(s1: String, s2: String): String{
    val set2 = s2.toSet()
    s1.toSet().forEach { if(set2.contains(it)) return "YES" }
    return "NO"

}
fun main(args: Array<String>){
    println(contains("hello", "world"))
    println(contains("sam", "help"))
}