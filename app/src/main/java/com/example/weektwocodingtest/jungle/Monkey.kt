package com.example.weektwocodingtest.jungle

class Monkey(energyLevel: Int) : Animal(energyLevel) {
    fun play(): String {
        if (energy < 8) return "Monkey is too tired"
        energy -= 8
        return "Oooo Oooo Oooo"
    }

    override fun eatFood(food: Food) {
        super.eatFood(food)
        energy += 2
    }

    override fun makeSound(): String {
        energy -=4
        return "Monkey sound\n\t${super.makeSound()}"
    }
}