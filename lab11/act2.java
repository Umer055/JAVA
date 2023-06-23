import java.util.*;
import java.util.InputMismatchException;

public class act2 {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the integer: ");
                int n = input.nextInt();
                System.out.println("The factorial is " + factorial(n));
                break;
            } catch (InputMismatchException ex) {
                System.out.println("You have entered a wrong input ");
                System.out.println("Try again !!!");
            }
        }

    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }
}