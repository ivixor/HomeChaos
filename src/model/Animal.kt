package model

/**
 * Project: KotlinPlayground
 * Author: Oleg Sushko
 * Date: 11/11/15
 */

abstract class Animal(name: String, legs: Int) {
    abstract fun makeSound() : String
}
