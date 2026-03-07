package constructor;
//  constructor in Java is a special block of code used to initialize objects when they are created.
public class main_file {
    public static void main(String[] args) {
        student student1 = new student("Ram",21);
        student student2 = new student("sita", 22);
       
        System.out.println(student1.name);
        System.out.println(student1.roll);

        System.out.println(student2.name);
        System.out.println(student2.roll);

        student1.study();
        student2.study();
    }
}
