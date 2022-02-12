public class Car {
    private double fuelAmount;
    private double fuelCapacity;
    private double fuelConsumption;
    private Point location = new Point();
    private String model;

    public Car(double capacity, double consumption, Point location, String model) throws CloneNotSupportedException {
        this.fuelAmount = 0;
        this.fuelCapacity = capacity;
        this.fuelConsumption = consumption;
        this.location.clone();
        this.model = model; 
    }
    Car( ) throws CloneNotSupportedException {
        this.fuelAmount = 0;
        this.fuelCapacity = 60;
        this.fuelConsumption = 0.6;
        this.location.clone();
        this.model = "Mercedes"; 
    }


    double getFuelAmount() {
        return fuelAmount;
    }

    double getFuelCapacity() {
        return fuelCapacity;
    }

    double getFuelConsumption() {
        return fuelConsumption;
    }

    Point getLocation() {
        return location;
    }

    void drive(Point destination) throws OutOfFuel {
        double newFuelConsumption;
        newFuelConsumption = this.location.distance(destination) * fuelConsumption;
        if ( newFuelConsumption > fuelAmount || fuelAmount == 0 )
        {
           throw new OutOfFuel();
        }
        location = destination;
        fuelAmount = fuelAmount - newFuelConsumption;
    }

    void drive(double x, double y) throws OutOfFuel {
        Point destination = new Point(x, y);
        drive(destination);
    }

    void refill(double fuel) throws ToMuchFuel {

        if ( fuelAmount + fuel > fuelCapacity) {
            throw new ToMuchFuel();
        }

        fuelAmount = fuelAmount + fuel;
    }

    public String toString () {
        return 
                            "model:" + model 
                          + "   capacity: " + fuelCapacity
                          + "   fuelAmount: " + fuelAmount
                          + "   fuelConsumption: " + fuelConsumption
                          + "   location: " + location;
    }
}