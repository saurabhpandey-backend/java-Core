package Exception_handling.try_catch;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        opretion opt = new opretion();
        
        System.out.println("enter two data for divide");
        opt.devi(scanner.nextInt(),scanner.nextInt());
        System.out.println("enter two data for ADD");
        opt.add(20, 30);
        scanner.close();
    }
}
