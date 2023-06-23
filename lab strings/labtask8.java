import java.util.Scanner;

public class labtask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line in which H comes twice or more!!! ");
        String alphabet = input.nextLine();
        int firstIndex = alphabet.indexOf('h');
        int lastIndex = alphabet.lastIndexOf('h');
        String remaString = alphabet.substring(0, firstIndex) + alphabet.substring(lastIndex);
        System.out.println(remaString);
        input.close();
    }
}
