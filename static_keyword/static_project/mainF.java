package static_keyword.static_project;

public class mainF {
    public static void main(String[] args){

        college student1 = new college(1, "Dipika", "Msc");
        college student2 = new college(2, "Saurabh", "MCA");
        college student3 = new college(3, "Ayush", "MCA");
        
        college.call();

        student1.list();
        student2.list();
        student3.list();


    }
}
