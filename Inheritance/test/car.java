package Inheritance.test;

public class car extends vahical{
    
    public String transmission;
    public int tyre_no;

    car(String type, String name, String modal, String transmission, int tyre_no){
        super(type,name,modal);
        this.transmission = transmission;
        this.tyre_no = tyre_no;
    }

    public void drift(){
        System.out.println(super.name + " is doing drifting!");
    }
}
