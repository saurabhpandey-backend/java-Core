package static_keyword;

public class main_file {
    public static void main(String[] args) {
        static_key key1 = new static_key("ram");
        static_key key2 = new static_key("sita");
        static_key key3 = new static_key("rita");
        static_key key4 = new static_key("mita");
        
        // System.err.println(static_key.no_of_stu);  // here call the static variable 

        static_key.call(); // here call static method
    }
}
