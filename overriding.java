package exam;

public class overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth2();
    }
}

class A{
    public void meth1(){
        System.out.println("I am form meth1 of class A");
    }
    public void meth2(){
        System.out.println("I am from meth2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am form meth2 from class B");
    }
}