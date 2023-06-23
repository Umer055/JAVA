import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat = 1;
        while (repeat == 1) {
            System.out.println("Enter the first number and second number:");
            int num1= input.nextInt();
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum of the two number are: "+sum);
            System.out.println("Enter 1 to enter sum of any two numbers and 0 to end the program");
            int repeat1 = input.nextInt();
            if (repeat1 == 0) {
                System.out.println("the program ended");
                break;
            }
            else if (repeat1 == 1) {
                repeat = 1;
            }
            else {
                System.out.println("you have entered wrong input");
            }
        }
    input.close();}
}