import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class chat {

    public static void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        long creditCardNumber = (long) (Math.random() * (100000000000L - 9999999999L + 1)) + 100000000000L;
        System.out.println("Your credit card number is " + creditCardNumber);
        System.out.print("Enter your pin: ");
        int pin = input.nextInt();

        try {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String timestamp = now.format(formatter);

            String filename = "name_" + timestamp + ".txt";
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(name + "\n");
            fileWriter.write(String.valueOf(creditCardNumber) + "\n");
            fileWriter.write(String.valueOf(pin));
            fileWriter.close();
            System.out.println("Account created successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void verifyAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String nameSignin = input.nextLine();
        System.out.print("Enter your credit card number: ");
        long creditCardSignin = input.nextLong();
        System.out.print("Enter your credit card pin: ");
        int pinSignin = input.nextInt();

        try {
            System.out.print("Enter the filename: ");
            input.nextLine(); // Consume newline character
            String filename = input.nextLine();

            Scanner fileReader = new Scanner(filename);
            String storedName = fileReader.nextLine();
            long storedCreditCardNumber = Long.parseLong(fileReader.nextLine());
            int storedPin = Integer.parseInt(fileReader.nextLine());

            if (storedName.equals(nameSignin) && storedCreditCardNumber == creditCardSignin && storedPin == pinSignin) {
                System.out.println("The file data matches the input data.");
            } else {
                System.out.println("The file data does not match the input data.");
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        createAccount();
        verifyAccount();
    }
}
