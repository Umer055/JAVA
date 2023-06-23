import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PROJECTPF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------Welcome to the Online Registration System----------\n");
        System.out.println("-----If you're a new user, press 1. If you already have an account, press 0-----\n");
        int newUser = input.nextInt();
        if (newUser == 1) {
            System.out.println("     Please enter your Name \n");
            String name = input.next();

            System.out.println("     Enter your Email ID     \n");
            String email = input.next();
            if (!email.endsWith("gmail.com")) {
                System.out.println("-----Kindly enter a valid Email-----\n");
                email = input.next();
            }

            System.out.println("     Enter your valid phone number     \n");
            String phoneNumber = input.next();
            // Checking the length of phone number
            if (phoneNumber.length() != 11) {
                System.out.println("-----Invalid phone number! Kindly enter it correctly-----\n");
                phoneNumber = input.next();
            }

            System.out.println("     Enter your Password     \n");
            String password = input.next();

            System.out.println("*************************************\n");
            System.out.println("  Your account has been created \n");
            System.out.println("*************************************\n");
            FileWriter writer;
            try {
                writer = new FileWriter("check.txt");
                writer.write(name + "\n");
                writer.write(email + "\n");
                writer.write(password);
                writer.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("Error is found. Please check your account and try again.");
                e.printStackTrace();
            }
            // If the user already have a account and want to chech flight timing
        } else {
            System.out.println("-----Kindly enter your username-----");
            String oldUser = input.next();
            System.out.println("-----Kindly enter your password-----");
            String oldPassword = input.next();
        }

        flight();
    }

    public static void flight() {
        Scanner input = new Scanner(System.in); // Giving choice to the user for details and booking
        System.out.println("\n----- If you want to check your flight details, press 1-----");
        System.out.println("\n     -----If you want to select a flight, press 2-----");
        int flightOption = input.nextInt();

        boolean matchFound = false; // Variable to verify if a match found

        switch (flightOption) {
            case 1:
                System.out.println("\n      Your flight from:     ");
                String from = input.next();
                System.out.println("\n     Enter your flight to:");
                String to = input.next();
                // using serval else if statments

                if (from.equalsIgnoreCase("Lahore") && to.equalsIgnoreCase("Karachi")) {
                    System.out.println("*****Your flight timing is 9 to 12*****\n");
                    System.out.println("           Have a safe flight       \n");
                    matchFound = true;
                } else if (from.equalsIgnoreCase("Karachi") && to.equalsIgnoreCase("Islamabad")) {
                    System.out.println("*****Your flight timing is 6 to 8*****");
                    System.out.println("           Have a safe flight       \n");
                    matchFound = true;
                } else if (from.equalsIgnoreCase("Multan") && to.equalsIgnoreCase("Karachi")) {
                    System.out.println("*****Your flight timing is 1 to 2:30*****");
                    System.out.println("           Have a safe flight      \n");
                    matchFound = true;
                } else {
                    System.out.println("-----Sorry! Data not matched-----");
                }
                break;

        }

        if (!matchFound) {
            flightOption2(); // Call the flightOption2 method if no match was found in case 1
        }
    }

    public static void flightOption2() {
        Scanner input = new Scanner(System.in); // serval option given in flightoptions2
        System.out.println("\n-----Several flights are available for today-----");
        System.out.println("\n     Press 'A' for flight to America     ");
        System.out.println("\n     Press 'B' for flight to London     ");
        System.out.println("\n     Press 'C' for flight to India");
        String choice = input.next();

        switch (choice.toUpperCase()) {
            case "A": // showing dersired outputs
                System.out.println("     You have requested for flight to America     ");
                System.out.println("\n*****Your flight timings are 12am-4pm*****");
                break;
            case "B":
                System.out.println("     You have requested for flight to London     ");
                System.out.println("\n*****Your flight timings are 4am-9pm*****");
                break;
            case "C":
                System.out.println("     You have requested for flight to India     ");
                System.out.println("\n*****Your flight timings are 3am-8am*****");
                break;
            default:
                System.out.println("\n-----Sorry no other flight avaliable-----");
                break;
        }
        payment();
    }

    public static void payment() {
        Scanner input = new Scanner(System.in);
        int correctDetails;
        long[][] receipts = new long[10][3]; // 2D array to store receipt details (assuming a maximum of 10
                                             // transactions)

        for (int i = 0; i < 10; i++) {
            System.out.println("\n-----Enter your Visa Card number-----");
            receipts[i][0] = input.nextLong();
            System.out.println("\n-----Please enter your card CCV-----");
            int ccv = input.nextInt();
            System.out.println("-----Enter your card Expiry-----");
            int expiry = input.nextInt();
            System.out.println("\n *****Kindly verify your details*****" + "\n 1 # Card number" + receipts[i][0]
                    + "\n 2 # CCV: " + ccv + "\n 3 # Expiry: " + expiry);
            System.out.println("-----If details are correct press 1 if not press 0-----");
            correctDetails = input.nextInt();

            if (correctDetails == 1) {
                int OTP;
                System.out.println("-----Enter the OTP you received-----");
                OTP = input.nextInt();
                System.out.println("-----Your Payment has been confirmed!----- \nThank you");

                // Store additional receipt details in the array
                receipts[i][1] = 21900; // Flight charges
                receipts[i][2] = 4099; // GST

                // Break out of the loop after successful payment confirmation
                break;
            } else {
                System.out.println("-----Details have been changed-----\n");
            }
        }

        feedback();
    }

    public static void feedback() {
        Scanner input = new Scanner(System.in);
        String feedback;
        System.out.println("-----Kindly share your precious feedback-----\n");
        feedback = input.next();
        System.out.println("-----Your Feedback is really appreciated-----\n");
    }

    public static void printReceipts(long[][] receipts) {
        System.out.println("                Final Receipt              ");

        for (int i = 0; i < receipts.length; i++) {
            if (receipts[i][0] != 0) { // Check if a receipt exists at this index
                System.out.println(" \nCard number " + receipts[i][0] + "\n\n2 # CCV : " + receipts[i][1]
                        + "\n\n3 # Expiry : " + receipts[i][2]);
                System.out.println("\nFlight charges = 21900 " + "\n GST = 4099"); // charges and GST
                System.out.println("\n Sub Total = 25999/ "); // Subtotal
            }
        }
    }
}
