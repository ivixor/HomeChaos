package model

import java.util.*

/**
 * Project: HomeChaos
 * Author: Oleg Sushko
 * Date: 11/11/15
 */

class ChaosInteractor {

    var animals : List<Animal>? = null

    fun growChaos(animalAmount : Int) {
        animals = ArrayList<Animal>(animalAmount)
        for (i in 0..animalAmount) {
            (animals as ArrayList<Animal>).add(generateAnimal())
        }
    }

    fun unleashChaos(chaosListener : OnChaosUnleash) {
        animals?.forEach { it.makeSound() }
    }

    fun generateAnimal() : Animal {
        return Cat("murchik", 4)
    }
}