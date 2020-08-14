// given java class from academy learnprogramming as a resource for exercise 3
package lexa.practice.resources.exercise3;

public class JavaMountainBike extends JavaBicycle {

    private int seatHeight;

    public JavaMountainBike(int seatHeight,
                        int cadence,
                        int speed,
                        int gear) {
        super(cadence, speed, gear);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
