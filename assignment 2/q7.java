import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pass = input.next();
        if (pass.length() < 9) {
            System.out.println("The input password less than 8 characters");
        } else {
            System.out.println("The password length is more than 8 characters!!");
        }
        isAlphanumeric(pass);
        TwoDigits(pass);
        input.close();

    }

    public static boolean isAlphanumeric(String pass) {
        for (char c : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("The password does not only consist of letters and numbers");
                return false;
            }
        }
        System.out.println("The password contains only letters and numbers");
        return true;
    }

    public static boolean TwoDigits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                count++;
            }
            if (count >= 2) {
                System.out.println("The password contains atleast 2 digits");
                return true;
            }
        }
        System.out.println("The password does not contain at least two digits!!");
        return false;
    }

}
