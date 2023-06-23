import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class new12 {

    // sign up
    // public static int[] sigup(int[] creditCard_number_array){
    // creditCard_number_array[1] = (int) ((long) (Math.random() * (100000000000L -
    // 9999999999L + 1)) + 100000000000L);
    // System.out.println("Your credit card number is " + creditCard_number);
    // }

    public static void signup() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        long creditCard_number = (long) (Math.random() * (100000000000L - 9999999999L + 1)) + 100000000000L;
        System.out.println("Your credit card number is " + creditCard_number);
        System.out.print("Enter your pin: ");
        int pin = input.nextInt();

        try {
            // File file = new File();
            FileWriter file_write = new FileWriter("name1.txt");
            file_write.write(name + "\n");
            file_write.write(String.valueOf(creditCard_number + "\n"));
            file_write.write(String.valueOf(pin));
            file_write.close();

        } catch (IOException e) {
            System.out.println("File not written");
        }
    }

    public static void signin() {
        Scanner input = new Scanner(System.in);
        Scanner file = new Scanner(file_write);
        System.out.print("Enter your name: ");
        String name_signin = input.nextLine();
        System.out.print("Enter your credit card number: ");
        long credit_card_signin = input.nextLong();
        System.out.print("Enter your credit card pin: ");
        int pin_signin = input.nextInt();
        try {
            // Read the file contents
            String fileContent = readFileContents("name1.txt");

            // Compare the file contents with the user input
            if (fileContent.equals(name_signin) && fileContent == credit_card_signin
                    && fileContent.equals(pin_signin)) {
                System.out.println("The file data matches the input data.");
            } else {
                System.out.println("The file data does not match the input data.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }

    private static String readFileContents(String filePath) throws IOException {
        File file = new File(filePath);
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
        }

        scanner.close();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE BANK");
        // System.out.print("Enter your name ----> ");
        // int name = input.nextInt();
        // long[] creditCard_number_array = new long[50];
        signup();
    }
}
