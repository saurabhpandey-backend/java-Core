package interface_mathod;

interface detail {
        String name();
}

class student {
    private int age = 18;
    
    void name(){
        System.out.println("he is human.");
        System.out.println(age);
    }
}
