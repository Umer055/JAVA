import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the decimal value you want to convert: ");
        int decimal = input.nextInt();
        decimaltobinary(decimal);
        input.close();
    }

    public static void decimaltobinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }
        System.out.println("Binary of decimal is: " + binary);
    }

}
