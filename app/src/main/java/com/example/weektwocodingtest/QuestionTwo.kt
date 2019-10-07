package com.example.weektwocodingtest

class QuestionTwo {
    fun subStrings(str: String): List<String> = subStrRecursive(str)
}

fun subStrRecursive(str: String): List<String> {
    if (str.length == 1) return listOf(str, "")

    val firstChar = str.first().toString()
    val lastN = str.drop(1)
    val subs: List<String> = subStrRecursive(lastN)
    return subs.map{ it -> firstChar + it} + subs
}
