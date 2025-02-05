// Derived class
public class MountainBike extends Bicycle {

    // The MountainBike subclass adds one more field
    public int seatHeight;

    // The MountainBike subclass has one constructor
    public MountainBike(int gear, int speed, int startHeight)
    {
        //Invoke base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // The MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // Overriding toString() method of Bicycle to print more info
    public String toString()
    {
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}
