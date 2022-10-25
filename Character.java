import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        char letter=sc.next().charAt(0);
        switch(letter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("it's a vowel");
                break;
            default:
                System.out.println("it's a consonant");
        }
    }
}
