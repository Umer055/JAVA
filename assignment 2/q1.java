import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter SSN: ");
        String ssn = input.next();
        if (ssn.length() == 11) {
            System.out.println(ssn + " Is a valid social security number");
        } else if (ssn.length() < 11) {
            System.out.println(ssn + " Is a a invalid social security number");
        }
        input.close();
    }

}