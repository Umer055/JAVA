import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double kilo = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double intemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double fitemp = input.nextDouble();
    double q = kilo * (fitemp - intemp)* 4184;
    System.out.print("The energy needed is : "+q);
input.close();
    }
}
