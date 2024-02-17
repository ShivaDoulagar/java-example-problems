package exam;
import java.util.Scanner;
public class factorial_using_loops {
    public static void main(String[] args) {
        System.out.println("Program to find factorial of given number using loops");
        System.out.print("Enter the number which you want to find the factorial:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        
        if(n==0 || n==1){
            System.out.println("The factorial of the given number is 1");
        }
        else{
            for(int i=1;i<=n;i++){
                a = a*i;
            }
        }
        System.out.println("The factorial of the given number is "+a);
    }
}
