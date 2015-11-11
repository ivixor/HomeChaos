package controller

import model.Animal
import model.ChaosInteractor
import model.OnChaosUnleash

/**
 * Project: KotlinPlayground
 * Author: Oleg Sushko
 * Date: 11/11/15
 */

class Human : OnChaosUnleash {

    var chaosInteractor : ChaosInteractor? = null

    fun prepareChaos(animalAmount : Int) {
        chaosInteractor?.growChaos(animalAmount)
    }

    fun startChaos() {
        chaosInteractor?.unleashChaos(this)
    }

    override fun onChaosUnleashed(sound: String) {
        throw UnsupportedOperationException()
    }
}