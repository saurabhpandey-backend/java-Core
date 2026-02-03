// These operators perform operations at the bit level.

// Bitwise Operators manipulate individual bits using AND, OR, XOR, and NOT.
// Shift Operators move bits to the left or right, effectively multiplying or dividing by powers of two.
class bitwise_opretor
{
    public static void main(String[] args)
    {
        // Bitwise operators
        int d = 0b1010;
        int e = 0b1100;
      
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
    }
}