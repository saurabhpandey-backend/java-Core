package Exception_handling.try_catch;

public class opretion {

    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void devi(int a, int b){
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("\nError decatected");
            System.out.println(e);
            System.out.println("devided by zero");
        }
        finally{
            System.out.println("go to the next step!\n");
        }
    }
}