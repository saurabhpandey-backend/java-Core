package Encapsulation;

public class Main {
    public static void main(String[] args) {
        capsul cap = new capsul("Saurabh", 23, "hiring");

        System.out.println(cap.name);
        System.out.println(cap.age);
        // System.out.println(cap.gf); //error
        System.out.println(cap.getgf());
        
        cap.setgf("nhi mili");
        System.out.println(cap.getgf());
    }
}
