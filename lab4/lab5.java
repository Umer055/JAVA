import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if (num1 == num2 && num2 == num3 && num1 == num3)
        System.out.println("3");
        else if (num1 == num2 || num2 == num3 || num1 == num3)
        System.out.println("2");
        else
        System.out.println("0");
        input.close();
    }
}
