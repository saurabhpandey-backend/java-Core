import java.util.Scanner;
public class area_of_rectangle {

    public static void main(String[] args) {
        double hight;
        double width;
        double area ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        width = scanner.nextDouble();
        System.out.println("Enter Hight");
        hight = scanner.nextDouble();

        area = width*hight;
        System.out.println("this is "+ area + " cm of Rectangle");

        scanner.close();
    }
}