public class overloded_method {
    public static void main(String[] args) {
        person("ram");
        person("ram",25);
        person("ram", "mirzapur", 35);
    }

    static void person(String name){
        System.out.println(name);
    }

    static void person(String name, int roll){
        System.out.println(roll+" "+name );
    }

    static void person(String name,String add, int roll){
        System.out.println(roll+" "+name+" "+add);
    }
}
