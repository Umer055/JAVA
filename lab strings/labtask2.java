import java.util.Scanner;

public class labtask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();
        if (code < 128) {
            char character = (char) code;
            System.out.println("The character for ASCII code is " + character);
        } else {
            System.out.println("You entered wrong input");
        }
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        int code2 = (int) character;
        System.out.println("The UNICODE for the character is " + code2);
        input.close();

    }
}
