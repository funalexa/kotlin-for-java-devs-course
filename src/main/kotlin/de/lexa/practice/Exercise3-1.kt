package de.lexa.practice

// ex: convert java code from folder "exercise3-given-javacode" to kotlin code

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

class MountainBike(cadence: Int, speed: Int, gear: Int, var seatHeight: Int)
    : Bicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class RoadBike(cadence: Int, speed: Int, gear: Int, val tireWidth: Int)
    : Bicycle(cadence, speed, gear) {
    override fun printDescription(){
        super.printDescription()
        println("The road bike has a tire width of $tireWidth mm.")
    }
}
