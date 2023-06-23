import java.util.Scanner;
public class lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        if (num1 > num2)
        System.out.println("second integer has the smaller value");
        if (num2 > num1)
        System.out.println("first integer has the smaller value");
        if (num1 % 2 == 0  && num2 % 2 == 0)
        {
        System.out.println("The integers are positive +1");
        }
        if (num1 % 2 != 0 && num2 % 2 != 0)
        System.out.println("The integers are negarive -1");
        if (num1 == num2 && num2 == 0)
        System.out.println("The integer is equal to zero 0");
input.close();
    }
}
