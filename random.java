import java.util.Random;
import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // boolean ishead;
        // ishead = scanner.nextBoolean();

        System.out.println("ram");
        // if (ishead) {
        //     System.out.println("Heads");
        // }
        // else{
        //     System.out.println("Tails");
        // }

        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }
}
