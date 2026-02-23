import java.util.Scanner;
public class sopping_cart {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String product ;
        double price;
        int quantity;
        System.out.print("What do you want to buy :- " );
        product = scanner.nextLine();
        System.out.print("price :- ");
        price = scanner.nextDouble();
        System.out.print("how many quantity do you want :- ");
        quantity = scanner.nextInt();
        System.out.println("You have brought "+ quantity+" "+ product);
        price=quantity*price;
        System.out.println("total is :- "+price);
        scanner.close();
    }
}
