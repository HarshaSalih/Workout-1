import java.util.Scanner;
public class Fibonacci {
    static int num1=0,num2=1,num3;
    static void fibonacci(int limit) {
        if (limit > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
            fibonacci(limit - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the limit");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        System.out.println("Fibonacci series");
        System.out.println(num1+"\n"+num2);
        fibonacci(limit - 2);
    }
}
