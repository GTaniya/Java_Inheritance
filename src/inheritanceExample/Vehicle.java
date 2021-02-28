package inheritanceExample;

public class Vehicle {
    public int gear;
    public int speed;


    public Vehicle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }


    public void Braking(int decrement)
    {
        speed -= decrement;
    }

    public void Speeding(int increment)
    {
        speed += increment;
    }


    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of the car is " + speed);
    }
}
