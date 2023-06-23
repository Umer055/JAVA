import java.util.Scanner;

public class practice {
    public static void check_even() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.print("The number is even!!");
        } else {
            System.out.print("The number is odd!!");

        }
        input.close();
    }

    public static void multiple() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        int num2 = input.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("The second number is multiple of the second number");
        } else {
            System.out.println("the number is not the multiple");
        }
        input.close();
    }

    public static void apples() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int std = input.nextInt();
        System.out.println("Enter the number of apples:");
        int apple = input.nextInt();
        int distribute = apple / std;
        int remans = apple - (std * distribute);
        System.out.println("The number of equally distribute apples are: " + distribute);
        System.out.println("The number of remaining apples are: " + remans);
        input.close();
    }

    public static void main(String[] args) {
        // check_even();
        // multiple();
        apples();
    }
}