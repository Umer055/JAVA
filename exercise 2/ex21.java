import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annualInterstRate = input.nextDouble();
        double inDecimal = annualInterstRate/100;
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();
        double monthlyInterstRate= inDecimal/12;
        double future_investment = investment * Math.pow((1 + monthlyInterstRate),years*12);
        System.out.printf("Accumulated value is %.2f",future_investment);
        input.close();
        

    }}
