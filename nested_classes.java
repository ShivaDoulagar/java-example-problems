package exam;

public class nested_classes {
    public static void main(String[] args) {
        // accessing outer class
        outer obj = new outer();
        obj.greet();
        // accessing inner class
        outer.inner obj1 = obj.new inner();
        obj1.hello();
    }
}

class outer{
    public void greet(){
        System.out.println("I am from outer class");
    }
    class inner{
        public void hello(){
            System.out.println("I am from inner class");
        }
    }
}