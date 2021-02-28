package inheritanceExample;

public class Car extends Vehicle{
    public String color;
    public String model;

    public Car(int gear, int speed, String carColor, String carModel)
    {

        super(gear, speed);
        color = carColor;
        model = carModel;
    }


    public void color(String newValue)
    {
        color = newValue;
    }
    public void model(String newValue)
    {
        model = newValue;
    }


    @Override public String toString()
    {
        return (super.toString() + "\nCar Model is " + model + "\nColor of the Honda CRV is "
                + color + "\nCar is steering..." + "\nCar is changing gear..." + "\nCar is moving..." );
    }

}

