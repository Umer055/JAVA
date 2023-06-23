import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int min = input.nextInt();
        int years=min /525600;
        int days=(min %525600)/(24*60);
        System.out.print(min+" minutes is approximately "+ years+" years"+" and days "+days);
input.close();

    }
}
