package de.lexa.practice;

import de.lexa.practice.resources.exercise6.ChallengeA;
import de.lexa.practice.resources.exercise6.KotlinCodeA;
import de.lexa.practice.resources.exercise6.KotlinEmployeeA;

public class Exercise6JavaA {

    // access kotlin code from resources, only change kotlin code

    public static void main(String[] args) {

          KotlinCodeA.sayHelloToJavaA("Student");

          KotlinEmployeeA employee = new KotlinEmployeeA("John", "Smith", 2010);
          employee.startYear = 2009;

          ChallengeA.doMath(5, 4);

          employee.takesDefaultA("arg1");

    }
}
