import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        int saving = input.nextInt();
        double num = saving * (1 + 0.00417); // 100.417
        double num1 = (100 + num )* (1 + 0.00417);
        double num2 = (100 + num1) * (1 + 0.00417);
        double num3 = (100 + num2) * (1 + 0.00417);
        double num4 = (100 + num3) * (1 + 0.00417);
        double num5 = (100 + num4) * (1 + 0.00417);
        System.out.print("After sixth month, the account value is "+num5);
input.close();
    }
}
