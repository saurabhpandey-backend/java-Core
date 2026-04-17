package Exception_handling.Finally;

public class handled {
        int a,b,c;
        public void add(int a,int b){
            try {
                c=a/b;
             }
            catch (Exception e) {
                System.out.println("div by 0");
                System.out.println(e);
            }
            finally{
                System.out.println("finally run");
            };
        }
    }