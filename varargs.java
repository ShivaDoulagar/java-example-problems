package exam;

public class varargs {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("The sum of 10 20 30 is "+obj.add(10,20,30));
        System.out.println("The sum of 10 20 is "+obj.add(10,20));
    }
}
//varargs is used when we don't knw how many parameters are needed to add. here it performs addition of numbers of n number of numbers
class A{
    public int add(int ...array){
        int result=0;
        for (int i:array){
            result +=i;
        }
        return result;
    }
}
