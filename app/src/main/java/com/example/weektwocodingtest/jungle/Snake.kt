package com.example.weektwocodingtest.jungle

class Snake(energyLevel: Int) : Animal(energyLevel) {
    override fun makeSound(): String {
        return "Snake sound\n\t${super.makeSound()}"
    }
}