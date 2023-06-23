import java.util.Scanner;

public class q2 {

    public static void perfect() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer you want to check: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println("The number is a perfect number");
        } else {
            System.out.println("the number is not a perfect number");
        }
        input.close();
    }

    public static void main(String[] args) {
        perfect();
    }
}
