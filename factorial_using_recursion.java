package exam;
import java.util.Scanner;
public class factorial_using_recursion {
    static int fact(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find the factorial:");
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println("The factorial of "+n+" is "+result);
    }
}