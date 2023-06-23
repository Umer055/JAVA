import java.util.Scanner;
public class class1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        if (num1 % 2 == 0 && num1 % 3 == 0 && num1 % 10 == 0){
            System.out.println("number is divisible by 2 3 5 and 10");
        }
        if (num1 % 2 == 0){
            System.out.println("number is divisible by 2");
        }
        if (num1 % 3 == 0){
            System.out.println("number is divisible by 3");
        }
        if (num1 % 5 == 0){
            System.out.println("number is divisible by 5");       
        }
        if (num1 % 10 == 0){
            System.out.println("number is divisible by 10");
        }
        input.close();
    }
}