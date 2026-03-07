package constructor_overloading;

public class user {
    
    String name;
    int id;
    String add;

    user(){
        this.name="No name";
        this.id=000000;
        this.add="khi bhi";
    }
    user(String name){
        this.name=name;
    }
    user(String name, int id){
        this.name=name;
        this.id=id;
    }
    user(String name, int id, String add){
        this.name=name;
        this.id=id;
        this.add=add;
    }
}
