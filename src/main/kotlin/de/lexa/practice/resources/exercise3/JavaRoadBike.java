// given java class from academy learnprogramming as a resource for exercise 3
package de.lexa.practice.resources.exercise3;

public class JavaRoadBike extends JavaBicycle {

    // In millimetres
    private int tireWidth;

    public JavaRoadBike(int cadence,
                        int speed,
                        int gear,
                        int tireWidth) {
        super(cadence, speed, gear);
        this.tireWidth = tireWidth;
    }

    public int getTireWidth() {
        return tireWidth;
    }

}
