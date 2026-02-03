
// The Ternary Operator is a shorthand version of the if-else statement. 
// It has three operands and hence the name Ternary.public class Geeks{
  public class ternary_operator{
    public static void main(String[] args){
        int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);
    }
}