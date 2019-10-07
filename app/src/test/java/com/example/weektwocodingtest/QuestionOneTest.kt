package com.example.weektwocodingtest

import org.junit.Test

import org.junit.Assert.*

class QuestionOneTest {

    @Test
    fun sortAsc() {
        val q1 = QuestionOne()

        val arr: Array<Int> = arrayOf(2,8,9,3,4,3,2,6,6,2,4,9,8)
        val expected: Array<Int> = arrayOf(2,2,2,3,3,4,4,6,6,8,8,9,9)

        val actual = q1.sortAsc(arr)

        for(i in arr.indices) {
            assertEquals(expected[i], actual[i])
        }
    }
}