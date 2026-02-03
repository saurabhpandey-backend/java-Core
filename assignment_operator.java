// The assignment operator assigns a value from the right-hand side to a variable on the left. 
// Since it has right-to-left associativity, the right-hand value must be declared or constant. 
public class assignment_operator {
  public static void main(String[]args){
      int a = 10; // here 10 is assign to veriable a
      System.out.println(a);
      a+=1; // here a+=1 means a = a + 1
      System.out.println(a); // 11
      a-=1;// here a+=1 means a = a - 1
      System.out.println(a); //
      a*=2;// here a+=1 means a = a * 2
      System.out.println(a);
      a/=5;// here a+=1 means a = a / 5
      System.out.println(a);
      a%=2;// here a+=1 means a = a % 2
      System.out.println(a);
  }
}