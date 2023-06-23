import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 0 and 1000: ");
    int num = input.nextInt();
    int num1 = num % 10; // 932 remainder 2
    int num2 = num / 10; // 932 divides 93
    int num3 = num2 % 10; // 93 remainder 3
    int num4 = num2 / 10; // 93 divides 9
    int allnum = num1 + num3 + num4;
    System.out.print("The sum of the digits are: "+allnum);
input.close();
    }
}
