import java.util.*;
// public class for_loop {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             System.out.println(i);
//         }
//     }
// }

// public class for_loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("how many Row's ");
//         int n = sc.nextInt();
//         for (int i = 0; i <=n; i++) {
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which table you want to print : ");
        int n= sc.nextInt();
        for (int i = 1; i <=10; i++) {
            int a = n*i;
            System.out.println(a);           
        }       
        sc.close();
    }
}