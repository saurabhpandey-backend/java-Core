// Method is a block of code that perform a specific task.
// It runs only when it is called and helps meke the program orgnized and reusable.
public class method {
  public static void main(String[] args) {
    add(5,2);
    sub(5, 3);
    multi(6, 3);
  }

//   here i create the method
// syntex is :- access_modifire static type_of_method method_name (parameters){
                                //   statement;
                                //   statement;
                                //   statement;      
                                    // }
                                    
  public static void add(int a, int b){
    System.out.println(a+b);
  }
  public static void sub(int a,int b){
    System.out.println(a-b);
  }
  public static void multi(int a,int b){
    System.out.println(a*b);
  }
}


