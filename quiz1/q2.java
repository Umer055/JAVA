import java.util.Scanner;


public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the cost of the item: ");
        double cost = input.nextDouble();
        System.out.print("the number of years from now on the item will be purchased: ");
        double years = input.nextDouble();
        System.out.print("Enter the rate of inflation: ");
        double inflation = input.nextDouble();
        double inflation_double = inflation/100;
        for (double i = 1;i <= years ; i++){
            cost = cost +(cost * inflation_double);
        }
        System.out.printf("The cost of the item after all the years will be: %.2f", cost);
        input.close();

    }
}
