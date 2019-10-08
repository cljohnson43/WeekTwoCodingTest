package com.example.weektwocodingtest.jungle

class Tiger(energyLevel: Int) : Animal(energyLevel) {

    override fun sleep() {
        super.sleep()
        energy += 5
    }

    override fun eatFood(food: Food) {
        if (food == Food.GRAIN) return
        super.eatFood(food)
    }

    override fun makeSound(): String {
        return "Tiger sound\n\t${super.makeSound()}"
    }
}