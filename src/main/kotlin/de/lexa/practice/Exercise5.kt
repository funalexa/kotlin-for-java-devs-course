package de.lexa.practice

fun main() {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)

    //destructuring
    val (firstName, lastName, age) = joe
    println("The person is called $firstName $lastName. $firstName is $age years old.")

    //create map
    val personMap = mapOf(
            joe.lastName to joe,
            mary.lastName to mary,
            john.lastName to john,
            jane.lastName to jane
    )

    // count people with last name starting with "W"
    println(personMap
            .filter {
                it.value.lastName.startsWith("W")
            }.size)

    // mapping names to pairs
    val namePairs = personMap
            .map {
                Pair(it.value.firstName, it.value.lastName)
            }

    // use of also()
    personMap.also {
        it.map { person ->
            println("${person.value.firstName} is ${person.value.age} years old!")
        }
    }

    // create lists with duplicates from two lists
    val list1 = listOf(1, 4, 9, 15)
    val list2 = listOf(4, 5, 6, 15)

    val duplicates = list1.intersect(list2)
    println(duplicates)
}

data class Person(val firstName: String, val lastName: String, val age: Int)
