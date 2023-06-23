import java.util.Scanner;

public class q1 {

    public static void vowels() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String:");
        String word = input.next();
        int count = 0;
        if (word.contains("a")) {
            count++;
        }
        if (word.contains("e")) {
            count++;
        }
        if (word.contains("i")) {
            count++;
        }
        if (word.contains("o")) {
            count++;
        }
        if (word.contains("u")) {
            count++;
        }
        System.out.println("The number of vowels in the string are: " + count);
        input.close();
    }

    public static void main(String[] args) {
        vowels();
    }
}