package com.example.weektwocodingtest.jungle

abstract class Animal(protected var energy: Int) {
    open fun makeSound(): String {
        energy -= 3
        return "Energy Level: $energy"
    }
    open fun eatFood(food: Food) {
        energy += 5
    }
    open fun sleep() {
        energy += 10
    }
}