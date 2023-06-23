import java.util.Scanner;

public class labtask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a alphabet: ");
        String alphabet = input.next();
        for (int i = 0; i < alphabet.length(); i++) {
            char alpha = alphabet.charAt(i);
            if (alpha == 'f')
                System.out.print(i);
        }
        input.close();
    }
}
