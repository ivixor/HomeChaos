package model

/**
 * Project: KotlinPlayground
 * Author: Oleg Sushko
 * Date: 11/11/15
 */

class Cat(name: String, legs: Int) : Animal(name, legs) {
    override fun makeSound() : String {
        return "meow"
    }
}