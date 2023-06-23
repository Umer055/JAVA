import java.util.Scanner;
public class lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the date month and last two digits of the year");
        int date = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();
        int date_x_month = date * month;
        if (date_x_month == year)
        System.out.println("The date is magic");
        else 
        System.out.println("The date is not magic");
        input.close();
    }
}
