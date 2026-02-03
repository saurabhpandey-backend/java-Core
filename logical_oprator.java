// Logical Operators are used to perform "logical AND" and "logical OR" operations,
// similar to AND gate and OR gate in digital electronics. They have a short-circuiting effect, 
// meaning the second condition is not evaluated if the first is false.
class logical_opretor{
      public static void main (String[] args) {
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}