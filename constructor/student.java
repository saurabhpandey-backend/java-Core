package constructor;

public class student {

    String name;
    int roll;

    student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    void study(){
        System.out.println(name+" is studing.");
    }

}