import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class newatm {

    public static boolean isAlpha(String name) {
        if (name == null || name == "") {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public static void createAccount() {
        Scanner input = new Scanner(System.in);
        String name = "o";
        int name_repeat = 1;
        while (name_repeat == 1) {

            System.out.print("\n*- Enter your name -->   ");
            name = input.nextLine();
            if (isAlpha(name)) {
                System.out.println("\n  The name is accepted !.!\n");
                name_repeat = 0;
            } else {
                System.out.println("\n  The entered name is not accepted \nEnter it again !.!");
                name_repeat = 1;
            }
        }
        long creditCardNumber = (long) (Math.random() * (100000000000L - 9999999999L + 1)) + 100000000000L;
        System.out.println("*- Your credit card number is -->   " + creditCardNumber);
        int pin = 0;
        int check = 1;
        while (check == 1) {
            try {
                System.out.print("\n*- Enter your pin -->   ");
                pin = input.nextInt();

                if (pin < 9999 && pin > 999) {
                    System.out.println("\n  The pin is accepted !.!\n");
                    check = 0;
                } else {
                    System.out.println("\n  The pin should be a 4-digit number ___\n");
                    System.out.println("*- Enter again -->   ");
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "\nYou have entered a non-integer input for the pin. Please enter a number for the pin.");
                System.out.print("Enter again  ");
                input.next(); // consume the invalid input
                System.out.println();
            }
        }

        try {
            FileWriter fileWriter = new FileWriter("name1.txt", true);
            fileWriter.write(name + "\n");
            fileWriter.write(String.valueOf(creditCardNumber) + "\n");
            fileWriter.write(String.valueOf(pin) + "\n");
            fileWriter.write("0\n"); // Initial balance
            fileWriter.close();
            System.out.println("\nAccount created successfully!");
            // fileWriter.close();
            // input.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void verifyAccount() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n*- Enter your name: ");
        String nameSignin = input.nextLine();
        long creditCardSignin = 0;

        int check = 1;
        while (check == 1) {
            try {
                System.out.print("*- Enter your credit card number: ");
                creditCardSignin = input.nextLong();
                if (creditCardSignin > 0 && creditCardSignin < 999999999999999L) {
                    check = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "\nYou have entered a non-integer input for the pin. Please enter a number for the pin.");
                System.out.print("Enter again  \n");
                input.next(); // consume the invalid input
                System.out.println();
            }
        }
        int pinSignin = 1111;
        int pin_check = 1;
        while (pin_check == 1) {
            try {
                System.out.print("*- Enter your credit card pin: ");
                pinSignin = input.nextInt();

                if (pinSignin < 9999 && pinSignin > 999) {
                    System.out.println("The pin is accepted !.!");
                    pin_check = 0;
                } else {
                    System.out.println("The pin should be a 4-digit number ___");
                    System.out.println("Enter again -->   ");
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "\nYou have entered a non-integer input for the pin. Please enter a number for the pin.");
                System.out.print("Enter again  \n");
                input.next(); // consume the invalid input
                System.out.println();
            }
        }
        try {
            Scanner fileReader = new Scanner(new File("name1.txt"));
            String storedName = "";
            int nameSignin_repeat = 1;
            while (nameSignin_repeat == 1) {

                storedName = fileReader.nextLine();
                if (nameSignin != storedName) {
                    for (int i = 0; i < 3; i++) {
                        fileReader.nextLong();
                    }
                } else {
                    nameSignin_repeat = 0;
                }
            }

            long storedCreditCardNumber = Long.parseLong(fileReader.nextLine());
            int storedPin = Integer.parseInt(fileReader.nextLine());

            if (storedName.equals(nameSignin) && storedCreditCardNumber == creditCardSignin && storedPin == pinSignin) {
                System.out.println("\n--------------------------------------------------------");
                System.out.println("We are logging in to your account");
                System.out.println("--------------------------------------------------------\n");
            } else {
                System.out.println("\nThe file data does not match the input data.\n");
                check();

            }
            // fileReader.close();
            // input.close();
        } catch (FileNotFoundException e) {
            System.out.println("--------------------------------------------------------");
            System.out.println("\tNo such account exist !!!!!: ");
            System.out.println("--------------------------------------------------------");
            check();
        }

        // try {
        // Scanner fileReader = new Scanner(new File("name1.txt"));
        // String storedName = fileReader.nextLine();

        // // Jump three lines
        // for (int i = 0; i < 3; i++) {
        // fileReader.nextLine();
        // }

        // // Read all lines after the fourth line
        // int lineCount = 4;
        // while (fileReader.hasNextLine()) {
        // String line = fileReader.nextLine();
        // // Perform checks or operations on each line here

        // // Example: Parsing credit card numbers from each line
        // long storedCreditCardNumber = Long.parseLong(line);
        // // ... perform further operations or checks
        // int storedPin = Integer.parseInt(fileReader.nextLine());

        // if (storedName.equals(nameSignin) && storedCreditCardNumber ==
        // creditCardSignin
        // && storedPin == pinSignin) {
        // System.out.println("\n--------------------------------------------------------");
        // System.out.println("We are logging in to your account");
        // System.out.println("--------------------------------------------------------\n");
        // } else {
        // System.out.println("\nThe file data does not match the input data.\n");
        // check();

        // }

        // lineCount++;
        // }

        // // Continue with the rest of your code...

        // // fileReader.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("--------------------------------------------------------");
        // System.out.println("\tNo such account exists!");
        // System.out.println("--------------------------------------------------------");
        // check();
        // }

    }

    public static void check() {
        String repeat = "1";
        while (repeat == "1") {
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("Enter 1 if you want to Create a new Account and 2 to verify your Account --> ");
            String check_input = input.nextLine();
            System.out.println("-------------------------------------------------------------------------------");
            if (check_input.equals("1")) {
                createAccount();
                repeat = "0";
            } else if (check_input.equals("2")) {
                verifyAccount();
                repeat = "0";
            } else {
                System.out.println("You have entered wrong input!!!");
                repeat = "1";
            }
        }
    }

    // Deposit money function
    public static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("*- Enter the money you want to deposit in the bank: ");
        int deposit = input.nextInt();
        try {
            if (deposit > 0) {

                File inputFile = new File("name1.txt");
                File tempFile = new File("temp.txt");

                Scanner fileReader = new Scanner(inputFile);
                FileWriter writer = new FileWriter(tempFile);

                String storedName = fileReader.nextLine();
                long storedCreditCardNumber = Long.parseLong(fileReader.nextLine());
                int storedPin = Integer.parseInt(fileReader.nextLine());
                int storedBalance = Integer.parseInt(fileReader.nextLine());

                storedBalance = storedBalance + deposit;

                writer.write(storedName + "\n");
                writer.write(String.valueOf(storedCreditCardNumber) + "\n");
                writer.write(String.valueOf(storedPin) + "\n");
                writer.write(String.valueOf(storedBalance) + "\n");

                writer.close();
                fileReader.close();

                System.out.println("\nYou have successfully deposited Rs. " + deposit + " ___");
                System.out.println("The remaining balance is Rs. " + storedBalance + " ___");

                if (inputFile.delete()) {
                    if (!tempFile.renameTo(inputFile)) {
                        throw new IOException("Could not rename temp file to original file");
                    }
                } else {
                    throw new IOException("Could not delete original file");
                }
            } else {
                System.out
                        .println(
                                "\nThe input money is in negative it cannot be deposited \nEnter a correct amount !!!");
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void checkbalance() {
        try {
            File inputFile = new File("name1.txt");

            Scanner fileReader = new Scanner(inputFile);

            String storedName = fileReader.nextLine();
            long storedCreditCardNumber = Long.parseLong(fileReader.nextLine());
            int storedPin = Integer.parseInt(fileReader.nextLine());
            int storedBalance = Integer.parseInt(fileReader.nextLine());
            System.out.println("\nThe remaning balance in the account is  " + storedBalance + "  Rs    !.!");
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.print("*- Enter the money you want to withdraw from the bank: ");
        int withdraw = input.nextInt();

        try {
            File inputFile = new File("name1.txt");
            File tempFile = new File("temp.txt");

            Scanner fileReader = new Scanner(inputFile);
            FileWriter writer = new FileWriter(tempFile);

            String storedName = fileReader.nextLine();
            long storedCreditCardNumber = Long.parseLong(fileReader.nextLine());
            int storedPin = Integer.parseInt(fileReader.nextLine());
            int storedBalance = Integer.parseInt(fileReader.nextLine());

            // Check if withdrawal amount is less than the available balance
            if (withdraw <= storedBalance) {
                storedBalance -= withdraw;

                writer.write(storedName + "\n");
                writer.write(String.valueOf(storedCreditCardNumber) + "\n");
                writer.write(String.valueOf(storedPin) + "\n");
                writer.write(String.valueOf(storedBalance) + "\n");

                writer.close();
                fileReader.close();
                System.out.println("\nYou have successfully withdrawn Rs. " + withdraw + " ___");
                System.out.println("The remaining balance is Rs. " + storedBalance + " ___");

                // Replace the original file with the updated file
                if (inputFile.delete()) {
                    if (!tempFile.renameTo(inputFile)) {
                        throw new IOException("Could not rename temp file to original file");
                    }
                } else {
                    throw new IOException("Could not delete original file");
                }
            } else {
                System.out.println("\n--------------------------------------------------------");
                System.out.println("The transaction cannot proceed because your balance is low");
                System.out.println("--------------------------------------------------------\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading/writing the file: " + e.getMessage());
            input.next();
        }
    }

    public static void transfer() {
        Scanner input = new Scanner(System.in);
        int name_repeat = 1;
        String acc_name = "";
        long transfer_amount = 0;
        while (name_repeat == 1) {

            System.out.print("*- Enter the account name to which you want to send money -->  ");
            acc_name = input.nextLine();
            if (isAlpha(acc_name)) {
                System.out.println("The name is accepted !.!");
                name_repeat = 0;
            } else {
                System.out.println("\nThe entered name is not accepted \nEnter it again !.!");
                name_repeat = 1;
            }
        }
        int check = 1;
        while (check == 1) {
            try {
                System.out.print("\nEnter the amount you want to send to  " + acc_name + "   -->  ");
                transfer_amount = input.nextLong();
                if (transfer_amount > 0 && transfer_amount < 999999999999999L) {
                    System.out.println("\n--------------------------------------------------------");
                    System.out.println("The money is being send to your desired account ____");
                    System.out.println("--------------------------------------------------------\n");
                    check = 0;
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "You have entered a non-integer input for the pin. Please enter a number for the pin.");
                System.out.print("Enter again  \n");
                input.next(); // consume the invalid input
                System.out.println();
            }
        }
        try {
            File inputFile = new File("name1.txt");
            File tempFile = new File("temp.txt");
            File transfer = new File("Transaction.txt");

            FileWriter writer1 = new FileWriter(transfer, true);
            Scanner fileReader = new Scanner(inputFile);
            FileWriter writer = new FileWriter(tempFile);

            writer1.write(acc_name + "\n");
            writer1.write(String.valueOf(transfer_amount) + "\n");

            String storedName = fileReader.nextLine();
            long storedCreditCardNumber = Long.parseLong(fileReader.nextLine());
            int storedPin = Integer.parseInt(fileReader.nextLine());
            int storedBalance = Integer.parseInt(fileReader.nextLine());

            // Check if withdrawal amount is less than the available balance
            if (transfer_amount <= storedBalance) {
                storedBalance -= transfer_amount;

                writer.write(storedName + "\n");
                writer.write(String.valueOf(storedCreditCardNumber) + "\n");
                writer.write(String.valueOf(storedPin) + "\n");
                writer.write(String.valueOf(storedBalance) + "\n");

                writer.close();
                writer1.close();
                fileReader.close();
                System.out.println("\nYou have successfully transfered Rs.  " + transfer_amount + " ___");
                System.out.println("The remaining balance is Rs.  " + storedBalance + " ___");

                // Replace the original file with the updated file
                if (inputFile.delete()) {
                    if (!tempFile.renameTo(inputFile)) {
                        throw new IOException("Could not rename temp file to original file");
                    }
                } else {
                    throw new IOException("Could not delete original file");
                }
            } else {
                System.out.println("\n--------------------------------------------------------");
                System.out.println("The transaction cannot proceed because your balance is low");
                System.out.println("--------------------------------------------------------\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading/writing the file: " + e.getMessage());
            input.next();
        }
    }

    public static void history() {
        File transfer = new File("Transaction.txt");
        System.out.println("\nThe Transaction history of your account is ---");
        System.out.println("\n--------------------------------------------------------");
        System.out.println("\nName is followed by the ammount you have sent to that person !!!!!!....");
        System.out.println("--------------------------------------------------------\n");

        try (BufferedReader reader = new BufferedReader(new FileReader(transfer))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n********************** Dear user ***********************");
        System.out.println("--------------------------------------------------------");
        System.out.println("" + "Enter 1 to deposit money . .");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter 2 to withdraw money . . ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter 3 to check balance . . .");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter 4 to transfer money . . .");
        System.out.println("--------------------------------------------------------");
        System.out.println("Enter 5 to check transaction history . . .");
        System.out.println("--------------------------------------------------------");
        System.out.print("\nEnter the number --: ");

        int menu = input.nextInt();
        System.out.println();

        if (menu == 1) {
            deposit();
        } else if (menu == 2) {
            withdraw();
        } else if (menu == 3) {
            checkbalance();
        } else if (menu == 4) {
            transfer();
        } else if (menu == 5) {
            history();
        } else {
            System.out.println("You have entered wrong input !.!.!.!");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "\n\t\t         ******----HELLO USER----****** \n\n\t    *********------WELCOME TO THE STATE BANK------*********\n\n");
        System.out.println("______________________ Do you want to sign in or sign up ___________________???");
        check();

        Scanner fileReader = new Scanner(new File("name1.txt"));
        String storedName = fileReader.nextLine();
        long storedCreditCardNumber = Long.parseLong(fileReader.nextLine());
        int storedPin = Integer.parseInt(fileReader.nextLine());
        int balance = Integer.parseInt(fileReader.nextLine());

        int menu_repeat_1 = 1;
        while (menu_repeat_1 == 1) {
            System.out.println(
                    "----------------------------------------------------------------------------------------");
            System.out.print("*- Enter Y to return back to the menu and N to finish the transaction -->  ");
            String choice = input.next();
            System.out.println(
                    "----------------------------------------------------------------------------------------\n");
            if (choice.equals("Y") || choice.equals("y")) {
                menu();

                System.out.println("\nWe are redirecting you back to the menu ____\n");
            } else if (choice.equals("N") || choice.equals("n")) {
                menu_repeat_1 = 0;
                System.out.println("Your transaction is completed \n\tthanks for your time!.!.!.!\n");
            } else {
                System.out.println("\nYou have entered the wrong input, please try again !.!\n");
                menu_repeat_1 = 1;
            }
        }
    }
}
