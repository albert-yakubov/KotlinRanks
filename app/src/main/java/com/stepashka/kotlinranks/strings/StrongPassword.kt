package com.stepashka.kotlinranks.strings

//numbers = "0123456789"
//lower_case = "abcdefghijklmnopqrstuvwxyz"
//upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//special_characters = "!@#$%^&*()-+"



fun minimumNumber(n: Int, password: String): Int {
        // Return the minimum number of characters to make the password strong
    val patterns = listOf("0123456789", "abcdefghijklmnopqrstuvwxyz",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "!@#$%^&*()-+")
    val violations = patterns.count { pattern -> pattern.none { password.contains(it) } }
        return violations.coerceAtLeast(6 - password.length)
}

val password = "Acura35RL!"
fun main(args: Array<String>){
    println(minimumNumber(6, password))
}