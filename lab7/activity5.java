import java.util.Scanner;

public class activity5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nonnegative integer: ");
        int n = input.nextInt();
        System.out.println("Frctorial of "+n+" is "+factorial(n));
        input.close();
    }
    public static long factorial (int n){
        if (n == 0)
            return 1;
        else 
            return n * factorial(n - 1);
    }
}
