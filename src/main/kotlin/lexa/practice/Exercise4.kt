package lexa.practice

fun main() {
    val range = 5..5000
    for (num in range step 5) {
        println(num)
    }
    val negativeRange = -500..0
    for (num in negativeRange) {
        println(num)
    }

    // print first 15 numbers of fibonacci sequence
    var firstNum = 0
    println(firstNum)
    var secondNum = 1
    println(secondNum)
    for (i in 1..13) {
        val nextNum = firstNum + secondNum
        println(nextNum)
        firstNum = secondNum
        secondNum = nextNum
    }

    //use three nested loops with labels and break/continue
    // to get the following output: 1, 11, 100, 99, 98, 2
    for (i in 1..5) {
        println(i)
        if (i == 2) break
        elevenToTwentyLoop@ for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) break@elevenToTwentyLoop
            }
        }
    }

    // declare a variable with num (int), assign it,
    // declare a varibale with dNum, assign it like:
    // if num >100, assign dnum -234.567
    // if num <100, assign dnum 4444.555
    // if num=100 assign dnum 0
    // just use one statement for dnum
    val num = 100
    val dNum: Double = when {
        num < 100 -> -234.567
        num > 100 -> 4444.555
        else -> 0.0
    }

    println("dNum is $dNum")
}
