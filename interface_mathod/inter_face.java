package interface_mathod;

interface name {
    void stname();
}

class inter_face extends student implements name {
    student student = new student();
    public void stname(){
        System.out.println("My name is ram.");
        name();
        // System.out.println(student.age);
    }
}
