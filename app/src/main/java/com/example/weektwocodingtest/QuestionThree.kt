package com.example.weektwocodingtest

data class Position(val row: Int, val col: Int) {}
data class StringEntry(val pos: Position, val str: String) {}

class QuestionThree {
    fun duplicates(arr: Array<Array<String>>): MutableList<Position> {
        val entries: MutableList<StringEntry> = mutableListOf()

        for(i in arr.indices) {
            for(j in arr[i].indices) {
                entries.add(StringEntry(Position(i,j), arr[i][j]))
            }
        }

        entries.sortWith ( object: Comparator<StringEntry> {
            override fun compare(a: StringEntry, b: StringEntry) = a.str.compareTo(b.str)
        })

        val duplicatePositions: MutableList<Position> = mutableListOf()
        var lastEntry = StringEntry(Position(0,0), "")
        for (i in entries.indices) {
            if (lastEntry.str == entries[i].str) {
                duplicatePositions.add(entries[i].pos.copy())
                duplicatePositions.add(lastEntry.pos.copy())
            }
            lastEntry = entries[i]
        }

        return duplicatePositions
    }
}

