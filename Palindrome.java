import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.next();
        int i,length = 0,flag = 0;
        char ch[] = text.toCharArray();
        for (char c : ch)
        {
            length++;
        }
        for (i = 0; i < length; i++)
        {
            if (ch[i] != ch[length - i - 1])
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
        {
            System.out.println("Not Palindrome");
        }
        else
        {
            System.out.println("Palindrome");
        }
    }

}

