package com.example.weektwocodingtest.jungle

class Jungle(private val animals: List<Animal>, private var food: List<Food>) {
    fun soundOff(): List<String> {
        return animals.map { it -> it.makeSound() }
    }
}