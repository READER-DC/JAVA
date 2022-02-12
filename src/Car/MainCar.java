public class MainCar {

    public static void main(String[] args) throws OutOfFuel, ToMuchFuel, CloneNotSupportedException {
        
        Car car = new Car();
        Car audi = new Car();
        audi.refill(9);
        audi.drive(10, 10);

        System.out.println( audi.toString());

    }

}