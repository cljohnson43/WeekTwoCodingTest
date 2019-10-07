package com.example.weektwocodingtest

class QuestionOne {
    fun sortAsc(list: Array<Int>): Array<Int> = list.copyOf().apply { sort() }
}