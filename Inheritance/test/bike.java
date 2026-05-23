package Inheritance.test;

public class bike extends vahical{
    public String handle;
    public int tyre_no;

    bike(String type, String name, String modal, String handle, int tyre_no){
        super(type,name,modal);
        this.handle = handle;
        this.tyre_no = tyre_no;
    }

    public void wheelie(){
        System.out.println(super.name + " doing wheelie!");
    }
}
