import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = input.nextInt();
        double sum = 1;
        for (double i = 2; i <=n;i++){
             sum += 1/i ;
        }
        System.out.printf("The sum is %.2f",sum);
        input.close();
    }
}
