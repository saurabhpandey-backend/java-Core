package Inheritance.test;

public class vahical {
    public String type;
    public String name;
    public String modal;

    vahical(String type, String name, String modal){
        this.type = type;
        this.name = name;
        this.modal = modal;
    }

    vahical(){
        this.type = null;
        this.modal = null;
        this.name=null;
    }
    public void engineStart(){
        System.out.println(name+" modal "+modal+ " engine's started!");
    }

    public void engineStop(){
        System.out.println(name+" modal "+modal+ " engine's stoped!");
    }
}
