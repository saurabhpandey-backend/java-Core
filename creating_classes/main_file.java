package creating_classes;

public class main_file {
    public static void main(String[] args) {
        car car1 = new car(); //this is called creating object

        System.out.println(car1.modal); // here i call the direct member attribute "modal"
        car1.start(); // here i call member function
        car1.stop();
    }    
}
