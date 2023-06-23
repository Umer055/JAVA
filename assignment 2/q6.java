import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String letter = input.next();
        reverseString(letter);
        isPalindrome(letter);
        input.close();
    }

    public static String reverseString(String letter) {
        String reversed = "";
        for (int i = letter.length() - 1; i >= 0; i--) {
            reversed += letter.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }

    public static boolean isPalindrome(String letter) {
        int start = 0;
        int end = letter.length() - 1;
        while (end > start) {
            if (letter.charAt(start) != letter.charAt(end)) {
                System.out.println("It is not a palidrome!!");
                return false;
            }
            end--;
            start++;
        }
        System.out.println("It is a palidrome");
        return true;
    }

}
