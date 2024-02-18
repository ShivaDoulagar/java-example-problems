package exam;
public class try_and_catch {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;//error occurs here then it executes the catch block
            System.out.println(c);
            System.out.println("This lines will not be executed because of error in line 7");
        }
        catch (ArithmeticException e){
            System.out.println("Division with 0 error");
        } 
        catch (Exception e){
            System.out.println("some other error");
        }
        System.out.println("The program does not end at the error ");
    }
}
