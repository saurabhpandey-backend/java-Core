package static_keyword.static_project;

public class college {
    
    static{
        System.out.println("\n\n                 'WELCOME' \n       KASHI INSTITUTE OF TECHNOLOGIYA");
    }

    static int no_of_student;
    int roll;
    String name;
    String couse;

    college(int roll,String name,String course){
        this.roll=roll;
        this.name=name;
        this.couse=course;
        no_of_student++;
    }

    void list(){
        System.out.println(name+" is in "+couse+" department and the roll number is "+roll);
    }

    static void call(){
        System.out.println("\ntotal student in college is :- "+ no_of_student);
        System.out.println("\nhere this is the list\n");
    }
}
