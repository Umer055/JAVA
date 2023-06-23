import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();
        double kilo = weight * 0.4535;
        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();
        double meter = height * 0.0254;
        double bmi = kilo / (meter * meter);
        System.out.print("bmi is "+bmi);
input.close();

    }
}
