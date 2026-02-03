import java.util.*;
public class even_odd{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.err.println("Enter the no :=");
    int num = sc.nextInt();

    if (num%2==0) {
      System.err.printf("num %d is even\n",num);
    }
    else{
      System.err.printf("num %d is odd\n",num);
    }
    sc.close();
 }
}