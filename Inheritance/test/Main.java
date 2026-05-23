package Inheritance.test;

public class Main {
    public static void main(String[] args) {
        car car = new car("car", "BMW", "M5", "6 Speed", 5);
        System.out.println(car.name);
        System.out.println(car.modal);
        System.out.println(car.type);
        System.out.println(car.tyre_no);
        car.engineStart();
        car.engineStop();
        car.drift();

        System.out.print("\n \n");

        bike bike = new bike("bike", "honda", "goldwiing", "U", 2);
        System.out.println(bike.name);
        System.out.println(bike.modal);
        System.out.println(bike.type);
        System.out.println(bike.tyre_no);
        bike.engineStart();
        bike.engineStop();
        bike.wheelie();
    }
}
