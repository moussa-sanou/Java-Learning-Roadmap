// Java program to illustrate the concept of inheritance.

public class Bicycle {

    // The Bicycle class has two fields
    public int gear;
    public int speed;

    // The Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // The bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gear are " + gear + "\n" + "speed of bicycle is " + speed);
    }
}
