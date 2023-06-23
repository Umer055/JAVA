import java.util.Scanner;
public class ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int cent = number % 100;
        int dollar = number /100;
        System.out.println("The dollars are  "+dollar+" and cents are "+cent);
input.close();
    }
}
