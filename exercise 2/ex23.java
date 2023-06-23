import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: " );
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milespergallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricepergallon = input.nextDouble();
        double cost = distance / milespergallon * pricepergallon;
        System.out.printf("The cost of driving is %.2f ",cost);
        input.close();
    }
}
