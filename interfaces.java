package exam;

public class interfaces {
    public static void main(String[] args) {
        cars car = new cars();
        car.BMW();
        car.audi();
    }
}
//interface used to leave the methord empty and implements ate used to define the methord
interface A{
    void BMW();
    void audi();
    default void rover(){
        System.out.println("I am rover");
    }
}

class cars implements A{
    public void BMW(){
        System.out.println("I am BMW");
    }
    public void audi(){
        System.out.println("I am audi");
    }
}