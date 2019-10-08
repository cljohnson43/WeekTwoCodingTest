package com.example.weektwocodingtest

import org.junit.Test

import org.junit.Assert.*

class QuestionTwoTest {

    @Test
    fun subStrings() {
        val q2 = QuestionTwo()

        val arg = "from"
        val expected: List<String> = listOf(
            "f", "fr", "fro", "fo", "r", "ro", "o", ""
        ).sorted()

        val results: List<String> = q2.subStrings(arg).sorted()

        assertEquals(expected.size, results.size)

        for (i in results.indices) {
            assertEquals(expected[i], results[i])
        }
    }
}