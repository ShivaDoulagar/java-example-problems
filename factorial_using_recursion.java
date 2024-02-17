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





// using the loops
// import java.util.Scanner;
// public class factoral{
//     public static void main(String[] args) {
//         System.out.println("Program to find the factorial");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int fact=sc.nextInt();
//         int a =1;
//         for ( int i=1;i<=fact;i++){
//              a = a*i;
//         }
//         System.out.println(a);
//     }
// }

// Using the recursion

// import java.util.Scanner;
//  public class factorial{
//     static int fact(int n){
//         if ( n==0 || n==1){
//             return 1;
//         }
//         else {
//             return n*fact(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the number which you want to find the factorial");
//         Scanner sc = new Scanner(System.in);
//         int fa = sc.nextInt();
//         System.out.println("The factorial of the given number is "+fact(fa));
//     }
//  }