// package Exception_handling;

// public class handle {

//     public static void main(String[] args) {
//         int a;
//         try {
//             a=10;
//             int c=a/0;
//         } catch (ArithmeticException e) {
//             System.out.println("Error detacted");
//             System.out.println("devided by 0");
//         }
//         finally{
//             System.out.println("this is Finally block");
//         }
//     }
// }

package Exception_handling;

public class handle {
    public static void main(String[] args) {
        handle handle = new handle();
        System.out.println(handle.obj());
    }
    int obj(){
        try {
           int a=25/10;
           return a;
        } 
        finally{
            System.out.println("this is finally");
        }
    }
}