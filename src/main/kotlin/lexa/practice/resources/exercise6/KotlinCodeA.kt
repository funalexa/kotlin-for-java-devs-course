@file:JvmName("KotlinCodeA")

package lexa.practice.resources.exercise6

fun sayHelloToJavaA(name: String) {
    println("Kotlin says hello to Java and $name")
}

object ChallengeA {
    @JvmStatic
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class KotlinEmployeeA(
        val firstName: String, val lastName: String, @JvmField var startYear: Int) {

    @JvmOverloads
    fun takesDefaultA(parm1: String, parm2: String = "default") {
        println("$parm1 and $parm2")
    }

}
