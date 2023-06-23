import java.util.Scanner;

public class labtask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line in which H comes twice or more!!! ");
        String alphabet = input.nextLine();
        System.out.println(alphabet.replace('h', 'H'));
        input.close();

    }
}
