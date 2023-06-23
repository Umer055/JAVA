import java.util.Scanner;
public class lab10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of books purchased this month: ");
        int book = input.nextInt();
        if (book == 0 )
        System.out.println("You have earned 0 points");
        else if (book == 1)
        System.out.println("YOU have earned 5 points");
        else if (book == 2)
        System.out.println("YOU have earned 15 points");
        else if (book == 3)
        System.out.println("YOU have earned 30 points");
        else if (book == 4)
        System.out.println("YOU have earned 60 points");
        else 
        System.out.println("You cannot purchase more than 4 books!!");
        input.close();
    }
}
