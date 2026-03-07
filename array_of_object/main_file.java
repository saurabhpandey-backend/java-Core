package array_of_object;

public class main_file {
    public static void main(String[] args) {
        // car car1 = new car("Defender", "Black");
        // car car2 = new car("Land Crusior", "White");
        // car car3 = new car("Cadillac Escalade", "Black");
        // car car4 = new car("Yukon Denali", "Black");

        // car cars[]={car1,car2,car3,car4};

        // Here is a Second Esay method 
        car cars[]={
            new car("Defender", "Lime Green"),
            new car("Land Crusior", "White"),
            new car("Cadillac Escalade","Black"),
            new car("Yokon Denali", "Black")

        };

        for (car car : cars) {
            car.drive();
        }
    }   
}
