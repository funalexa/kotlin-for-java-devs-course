package de.lexa.practice

fun main() {
    val kotlinBicycle = Bicycle(1, 1, 1)
    kotlinBicycle.printDescription()
    val kotlinMountainBike = MountainBike (9, 2, 2, 2)
    kotlinMountainBike.printDescription()
    val kotlinRoadBike = RoadBike(1, 3, 3, 3)
    kotlinRoadBike.printDescription()
    val colouredKotlinMountainBike = MountainBike("red", 2, 2, 2,2)
    for ( colour in MountainBike.availableColours) {
        println(colour)
    }
}
