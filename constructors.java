package exam;

public class constructors {
    public static void main(String[] args) {
        son obj1 = new son(4,5,6);//here all the consturctors will be called of dad mum and son.
        mum obj2 = new mum(2,3);// here the dad's consturctor will be called.
    }
}

class dad{
    dad(){
        System.out.println("I am from dad's class with no value");
    }
    dad(int a){
        System.out.println("I am from dad's class with value "+a);
    }
}
class mum extends dad{
    mum(){
        System.out.println("I am form the mom's class with no value");
    }
    mum(int a,int b){
        super(a);//we use super key word because using super key word we take the value of a from the dad's overloaded methord. Same value of the dad's class will be taken using super()
        System.out.println("I am from the mom's class with values"+a+" and "+b);
    }
}
class son extends mum{
    son(){
        System.out.println("I am form son's class with no value");
    }
    son(int a,int b,int c){
        super(a,b);
        System.out.println("I am form son's class with values "+a+" "+b+" "+c);
    }
}
