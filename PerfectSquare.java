import java.util.Scanner;
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two intervals");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        System.out.println("Perfect squares between " + a + " and " + b + " are ");
        for (i=a;i<=b;i++)
        {
            if (Math.sqrt(i) == (int)Math.sqrt(i))
            {
                System.out.print(i + " ");
            }

        }
    }
}
