// given kotlin file from academy learnprogramming as a resource for exercise 3

package lexa.practice.resources.exercise6

fun sayHelloToJavaB(name: String) {
    println("Kotlin says hello to Java and $name")
}

object ChallengeB {
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class KotlinEmployeeB(
        val firstName: String, val lastName: String, var startYear: Int) {

    fun takesDefaultB(parm1: String, parm2: String = "default") {
        println("$parm1 and $parm2")
    }

}
