package lexa.practice;

import lexa.practice.resources.exercise6.ChallengeA;
import lexa.practice.resources.exercise6.KotlinCodeA;
import lexa.practice.resources.exercise6.KotlinEmployeeA;

public class Exercise6JavaA {

    // access kotlin code from resources, only change kotlin code

    public static void firstJavaMain() {

          KotlinCodeA.sayHelloToJavaA("Student");

          KotlinEmployeeA employee =
                  new KotlinEmployeeA("John", "Smith", 2010);
          employee.startYear = 2009;

          ChallengeA.doMath(5, 4);

          employee.takesDefaultA("arg1");

    }
}
