import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num+" It is a prime number");
        }
        else {
            System.out.println(num+" It is not a prime number");
        }
    
        input.close();
    }
}
