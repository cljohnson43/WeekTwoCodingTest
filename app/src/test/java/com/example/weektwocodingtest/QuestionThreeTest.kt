package com.example.weektwocodingtest

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

class QuestionThreeTest {

    @Test
    fun duplicates() {
        val q3 = QuestionThree()

        val arg: Array<Array<String>> = arrayOf(
            arrayOf("a", "b", "c"),
            arrayOf("d", "e", "f"),
            arrayOf("g", "a", "b")
            )

        val expected: MutableList<Position> = mutableListOf(
            Position(0,0),
            Position(0,1),
            Position(2,1),
            Position(2,2)
        )

        val results = q3.duplicates(arg)
        results.sortWith( object: Comparator<Position>{
            override fun compare(a: Position, b: Position): Int {
                if (a.row == b.row){
                    return a.col.compareTo(b.col)
                }
                return a.row.compareTo(b.row)
            }
        })

        assertEquals(expected.size, results.size)
        for (i in results.indices) {
            assertEquals(expected[i].row, results[i].row)
            assertEquals(expected[i].col, results[i].col)
        }
    }
}