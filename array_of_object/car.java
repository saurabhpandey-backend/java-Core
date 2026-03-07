package array_of_object;

public class car {
    String name;
    String color;

    car(String name,String color){
        this.name=name;
        this.color=color;
    }

    void drive(){
        System.out.println(name +" have color "+color);
    }
}
