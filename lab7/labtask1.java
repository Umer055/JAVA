import java.util.Scanner;
public class labtask1 {
    public static void reverse(int num){
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev *10 + digit;
            num /= 10;
        }
        System.out.println("The reverse of the number is "+rev);        
    }  
    public static void sum(int num){
        int rem, sum =0 ;
        while ( num > 0){
            rem = num % 10;
            sum +=rem;
            num = num/10;
        }
        System.out.println("The sum of the number is "+sum);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        sum(num);        
        reverse(num);
    }
}
