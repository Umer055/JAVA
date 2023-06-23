import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev *10 + digit;
            num /= 10;
        }
        System.out.println("The reversed integer is: "+rev);
        input.close();
    }
}
