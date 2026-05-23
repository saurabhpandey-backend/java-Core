package Encapsulation;
 
public class capsul {
    public String name;
    public int age;
    private String gf;

    public String getgf(){
        return this.gf;
    }

    public void setgf(String gf){
        this.gf=gf;
    }
    capsul (String name, int age, String gf){
        this.name = name;
        this.age=age;
        this.gf=gf;
    }
}
