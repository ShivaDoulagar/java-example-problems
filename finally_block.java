package exam;

public class finally_block {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println("This print line will not be executed bacause of error at line 8");
        }
        catch(ArithmeticException e){
            System.out.println("division with zero error ");
        }
        catch(Exception e){
            System.out.println("Some other exeption");
        }
        finally{
            System.out.println("This block will execute even the error occurs or not");
        }
    }
}
