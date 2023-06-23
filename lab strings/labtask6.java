import java.util.Scanner;

public class labtask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabets: ");
        String a1 = input.next();
        String a2 = input.next();
        System.out.println("The input is " + a1 + " and " + a2);
        String temp = "";
        temp = a1;
        a1 = a2;
        a2 = temp;
        System.out.println("The output is " + a1 + " and " + a2);
        input.close();
    }
}
