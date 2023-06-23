import java.util.Scanner;

public class atmachine {

    // Deposite money funcion
    public static int deposit(int def_deposit) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money you want to deposit in the bank --->  ");
        int deposit = input.nextInt();
        return deposit;

    }

    // function to check the balance of the account
    public static int checkbalance(int def_deposit) {
        int balance = 0;
        balance = balance + def_deposit;
        return balance;

    }

    // function to withdraw money from the bank
    public static int withdraw(int def_deposit) {
        Scanner input = new Scanner(System.in);
        int balance = 0;
        checkbalance(def_deposit);
        if (checkbalance(def_deposit) < 0) {

            System.out.println("Your balance is 0 Rs you cannot withdraw money !.!.!.!");
        } else {
            System.out.println("Enter the money you want to withdraw from the bank --->  ");
            int withdraw = input.nextInt();
            balance = checkbalance(def_deposit) - withdraw;
            System.out.println("The money you have withdrawn is " + withdraw + " Rs");
        }

        return balance;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE BANK");

        // //sign Up

        // credit card number generation
        System.out.print("Enter your name:  ");
        String name = input.nextLine();
        long creditCard_number = (long) (Math.random() * (100000000000L - 9999999999L + 1)) + 100000000000L;
        System.out.println("Your credit card number is " + creditCard_number);

        // pin enter
        int pin_repeat1 = 1;
        int pin = -111;
        while (pin_repeat1 == 1) {

            System.out.print("Enter your 4-digit pin :  ");
            pin = input.nextInt();
            if (pin > 999 && pin < 10000) {
                System.out.println("Your new account pin is " + pin);
                pin_repeat1 = 0;
            } else {
                System.out.println("Your pin should be of 4 digits");
            }
        }
        // sign In
        System.out.println("\n\n it's time to sigin to your account ");

        // checking if the credit card number is correct or not
        int repeat = 1;
        while (repeat == 1) {

            System.out.print("Enter your valid credit card number to login: ");
            long creditcard_signin = input.nextLong();
            if (creditcard_signin == creditCard_number) {
                System.out.println("You enterd a correct credit card number!.!.!.!.!.");
                repeat = 0;
            } else {
                System.out.println("Wrong credit card number!.!.!.!.!.!\ninput it again -->");
            }

            // checking if the pin is correct or not
        }
        int pin_repeat2 = 1;
        while (pin_repeat2 == 1) {

            System.out.print("Now enter your pin code ---> ");
            int input_pin = input.nextInt();
            if (input_pin == pin) {
                System.out.println("Congratulation's you have successfuly entered in the account");
                pin_repeat2 = 0;
            } else {
                System.out.println("Wrong input it again . . .");
            }
        }

        int main_repeat = 1;
        while (main_repeat == 1) {

            System.out.println("\n\n Dear user " + name
                    + "\n Enter 1 to deposit money . .\n Enter 2 to withdraw money . . \n Enter 3 to check balance . . .");
            int menu = input.nextInt();
            int def_deposit = -111;
            if (menu == 1) {
                // deposit(def_deposit);
                System.out.println(" DONE !!\n You have successfully deposited " + deposit(def_deposit) + " Rs");
            } else if (menu == 2) {
                // withdraw(def_deposit);
                if (withdraw(def_deposit) == -111) {
                    if (withdraw(def_deposit) < 0) {
                        System.out.println("Your current balance is 0 Rs");

                    }
                } else {

                    System.out.println("Your current balance is " + withdraw(def_deposit) + " Rs");
                }
            } else if (menu == 3) {
                // deposit(def_deposit);
                // checkbalance(def_deposit);
                if (checkbalance(def_deposit) == -111) {
                    if (checkbalance(def_deposit) < 0) {
                        System.out.println("Your current balance is 0 Rs");

                    }
                } else {

                    System.out.println("Your current balance is " + checkbalance(def_deposit) + " Rs");
                }
            } else {
                System.out.println("You have entered a wrong input ");
            }

            System.out.println("Enter Y to return back to the menu and N to finish the transaction");
            String choice = input.next();
            if (choice == "Y") {
                main_repeat = 1;
                System.out.println("We are redirecting you back to the menu");
            } else if (choice == "N") {
                main_repeat = 0;
                System.out.println("Your transaction is completed \n\tthanks for your time!.!.!.!");
            } else {
                System.out.println("You have entered wrong input enter it again --->  ");
            }
        }
    }
}
