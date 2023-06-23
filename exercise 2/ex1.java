import java.util.Scanner;
public class ex1{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the temperature in Celcius: ");
    double Celcius = input.nextDouble();
    double fahrenheit =  (9.0 / 5) * Celcius + 32;
    System.out.println("The temperature in fahrenhiet will be: "+fahrenheit);
    input.close();

    }
}