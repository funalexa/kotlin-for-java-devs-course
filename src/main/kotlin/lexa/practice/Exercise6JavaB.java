package lexa.practice;

import lexa.practice.resources.exercise6.ChallengeB;
import lexa.practice.resources.exercise6.KotlinCodeBKt;
import lexa.practice.resources.exercise6.KotlinEmployeeB;

public class Exercise6JavaB {

    // access kotlin code from resources by only changing this java code

    public static void main(String[] args) {

        KotlinCodeBKt.sayHelloToJavaB("Student");

        KotlinEmployeeB employee =
                new KotlinEmployeeB("John", "Smith", 2010);
        employee.setStartYear(2009);

        ChallengeB.INSTANCE.doMath(5, 4);
    }
}
