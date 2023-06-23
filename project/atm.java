import java.util.Scanner;

public class atm {

    public static long randomNumber() {
        long function_randomNumber = (long) (Math.random() * (1000000000000L - 99999999999L + 1)) + 1000000000000L;
        return function_randomNumber;

    }

    public static void signup(long function_randomNumber) {
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t Enter your name -->");
        String name = input.nextLine();
        long randomNumber = function_randomNumber;
        System.out.print("\t\t HI " + name + "\n\t\t Your new credit card number is -->  " + randomNumber);
        System.out.print("\t\t Enter your new pin -->");
        int pin = input.nextInt();

    }

    // private static long generateRandomNumber(long min, long max) {
    // return (long) (Math.random() * (max - min + 1)) + min;

    // }

    // public static void signin(long randomNumber) {
    // Scanner input = new Scanner(System.in);
    // System.out.print("Enter your account number --> ");
    // long account_num = input.nextLong();
    // long min = 99999999999L;
    // long max = 1000000000000L;
    // System.out.println(randomNumber);
    // if (account_num > min && account_num < max) {
    // if (account_num == randomNumber) {

    // System.out.println("Your credit card number is correct!!!");
    // }
    // } else {
    // System.out.println("You have input wrong credit card number!!!!");
    // }
    // }

    public static void check(long function_randomNumber) {
        int repeat = 1;
        while (repeat == 1) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter 1 if you want to SignIn and 2 to SiginUp");
            int check_input = input.nextInt();
            if (check_input == 1) {
                // signin(function_randomNumber);
                repeat = 0;
            } else if (check_input == 2) {
                signup(function_randomNumber);
                // signin(check_input);
                repeat = 0;

            } else {
                System.out.println("You have entered wrong input!!!");
                repeat = 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("******----Hello user----****** \n *********------WELCOME TO THE STATE BANK------*********");
        System.out.println("Do you want to sigin or siginup");
        check(randomNumber());
    }
}
