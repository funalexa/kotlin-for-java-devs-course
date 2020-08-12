package de.lexa.practice

// ex: convert java code from folder "exercise3" in "resources" to kotlin code

open class Bicycle(var cadence: Int, var speed: Int, var gear: Int){

    fun applyBrake(decrement: Int) {
    speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("The bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

class MountainBike(var seatHeight: Int, cadence: Int = 5, speed: Int = 10, gear: Int = 5)
    : Bicycle(cadence, speed, gear) {
    constructor(colour: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int)
     : this(seatHeight, cadence, speed, gear){
        println("The mountain bike is coloured $colour")
    }
    companion object {
        val availableColours = listOf<String>("red", "blue", "green", "yellow", "black", "white")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class RoadBike(private val tireWidth: Int, cadence: Int = 1, speed: Int = 20, gear: Int = 5)
    : Bicycle(cadence, speed, gear) {
    override fun printDescription(){
        super.printDescription()
        println("The road bike has a tire width of $tireWidth mm.")
    }
}
