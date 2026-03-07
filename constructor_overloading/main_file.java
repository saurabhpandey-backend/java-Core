package constructor_overloading;
// overloded construtor are allow a class have multiple construtor with
// different parameter list. Enable object to be initialized in verious way
public class main_file {
    public static void main(String[] args) {
        user user1 = new user();
        user user2 = new user("ram");
        user user3 = new user("ram",21);
        user user4 = new user("ram",21,"mirzapur");

        System.out.println(user1.name+" is from "+user1.add+" roll no is "+user1.id);
        System.out.println(user2.name+" is from "+user2.add+" roll no is "+user2.id);
        System.out.println(user3.name+" is from "+user3.add+" roll no is "+user3.id);
        System.out.println(user4.name+" is from "+user4.add+" roll no is "+user4.id);
    }
}
