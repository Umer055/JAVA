import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value for the feet: ");
    double feet = input.nextDouble();
    double meters = feet * 0.305;
    System.out.print(feet+" feet is "+meters+" meters");
    input.close();
    }
}
