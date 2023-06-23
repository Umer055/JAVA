import java.util.Scanner;
public class lab9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of pennies: ");
        double pennies = input.nextInt();
        System.out.println("Enter the number of nickels: ");
        double nickels = input.nextInt();
        System.out.println("Enter the number of dimes: ");
        double dimes = input.nextInt();
        System.out.println("Enter the number of quaters: ");
        double quaters = input.nextInt();
        double nickels_to_pennies = nickels * 5;
        double dimes_to_pennies = dimes * 10;
        double quaters_to_pennies = quaters * 25;
        double dollar = (pennies + nickels_to_pennies + dimes_to_pennies + quaters_to_pennies)/100;
        if (dollar == 1)
        System.out.println("Congratulate it is won dollar you won the game");
        else if (dollar > 1)
        System.out.println("The amount entered was greater than 1");
        else if (dollar < 1)
        System.out.println("The amount entered is less than 1");
        input.close();

    }
}
