package exam;

public class overloading {
    static int add(int a,int b){
        return a+b;
    }
    //Here the name of the both methords are same but differ in parameter, This is methord overLoading.
    static int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=add(a,b);
        int e=add(a,b,c);
        System.out.println("The addition of two numbers is "+d);
        System.out.println("The addition of the three numbers is "+e);
    }
}
