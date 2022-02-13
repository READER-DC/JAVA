public class MainCar {

    public static void main(String[] args) throws OutOfFuel, ToMuchFuel, CloneNotSupportedException {
        
        Car car = new Car();
        Car audi = new Car();
        audi.refill(9);
        System.out.println( audi.toString());
        audi.drive(10, 10);
        System.out.println( audi.toString());
        audi.refill(20);
        System.out.println( audi.toString());
        audi.drive(20, 20);

        System.out.println( audi.toString());

        audi.refill(50);
        System.out.println( audi.toString());

    }

}

/*
Машинка обладает следующими свойствами:

    Запас топлива (fuelCapacity)
    Количество топлива (fuelAmount)
    Расход топлива (fuelConsumption)
    Положение на Декартовой плоскости (location)
    Модель (model)

Положение определяется в виде точки на координатной плоскости. Для реализации использовать уже написаный класс Point.
Машинка может ехать до другой точки. Перед началом передвижения необходимо рассчитать количество топлива, которое затратит машинка. Это очень сложно: посчитать расстояние между двумя точками и умножить на расход топлива.
Если у машинки недостаточно топлива, чтобы совершить перемещение — езда не начинается.
Машину можно заправить топливом. Влить в машину топлива больше, чем вмещает бензобак невозможн
*/