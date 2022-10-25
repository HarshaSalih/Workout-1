import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in Farenheit");
        float tempInFarenheit=sc.nextFloat();
        float tempInCelsius;
        tempInCelsius=(tempInFarenheit-32)*5/9;
        System.out.println("Temperature in Celsius = " + tempInCelsius);

    }
}
