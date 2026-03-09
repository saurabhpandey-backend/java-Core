package static_keyword;

// Static keyword in java is used to create class-level variable and methods that belong 
// to the class rather then any object.

public class static_key {
        // this is static it run's automatically when class gone loaded
    static{
        System.out.println("this is College.");
    }

    // here is static variable it create the copy who's comman for all object.
    static int no_of_stu;

    String name;
    static_key(String name){
        this.name=name;
        no_of_stu++;
    }

    // here this is static method no need to create object

    static void call(){
        System.err.println("there are "+no_of_stu+" student in college.");
    }
}
