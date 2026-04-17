package Exception_handling.Finally;

public class without_handle_error {
    int a,b,c;
    public void add(int a,int b){
        try {
            c=a/b;
         }// catch (Exception e) {
        //     // TODO: handle exception
        // }
        finally{
            System.out.println("finally run");
        };
    }
}

// output

// finally run
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Exception_handling.without_catch.opretion.add(opretion.java:7)
//         at Exception_handling.without_catch.Main.main(Main.java:6)