package exam;

public class methord_binding extends parent {
    public static void sample(){
        System.out.println("I am methord form main class");
    }
    public static void main(String[] args) {
        methord_binding.sample();
    }
}

class parent{
    public static void sample(){
        System.out.println("I am methord from parent class");
    }
}