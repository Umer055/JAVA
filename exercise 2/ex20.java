import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate: ");
        double balance = input.nextDouble();
        double interst = input.nextDouble();
        double interest = balance * (interst/1200);
        System.out.printf("The interst is %.4f",interest);
    
input.close();
    }
}
