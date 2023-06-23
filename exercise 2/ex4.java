import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number in pounds: ");
    double pounds = input.nextDouble();
    double kilo = pounds * 0.454;
    System.out.print(pounds+" pounds is "+kilo+" kilograms");
    input.close();
    }

}
