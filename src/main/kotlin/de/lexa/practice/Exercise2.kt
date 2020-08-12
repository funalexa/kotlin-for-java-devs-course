package de.lexa.practice

fun secondMain() {
// 1. Declare a non-nullable float variable two ways,
    // and assign it the value -3847.384

    val nonNullFloat1 = -3847.384f
    val nonNullFloat2: Float = -3847.384f


    // 2. Now change both of those variable declarations into nullable variables.

    val possibleNullFloat: Float? = 14.5f


    // 3. Now declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, and 5.

    val shorts = Array(5) { i -> i + 1.toShort() }


    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, etc., all the way up to 200.

    val intArray: Array<Int?> = Array(40) { i -> 5 * (i + 1) }


    // 5. You have to call a Java method with the following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could
    // pass to the method and initialize it with the values 'a', 'b', and 'c'.

    val chars = charArrayOf('a', 'b', 'c')
    val javaDummy = JavaClass()
    javaDummy.charTestMethod(chars)

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line of code, declare another string variable,
    // and assign it x.toLowerCase() when x isn't null,
    // and the string "I give up!" when x is null.

    val result = x?.toLowerCase() ?: "I give up!"


    // 7. Now use the let function to (a) lowercase the string, and then
    // (b) replace "am" with "am not" in the result

    val lowerCaseString = x?.let { println(it.toLowerCase().replace("am", "am not"))  }

    // 8. You're really, really confident that the variable myNonNullVariable can't
    // contain null.
    // Change the following code to assert that myNonNullVariable isn't null
    // (and shoot yourself in the foot!)
    val myNonNullVariable: Int? = 1
    val myReallyNonNullVariable = 1L
    myNonNullVariable!!.compareTo(myReallyNonNullVariable)
}
