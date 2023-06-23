import java.util.Scanner;
public class gradedlab6 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the hours you have worked : ");
    double hours = input.nextDouble();
    System.out.print("Enter the hourly payrate $ ");
    double payrate = input.nextDouble();
    double income = hours * payrate;
    System.out.println("Your income before paying tax is $"+income);
    double tax = income * 0.14;
    double incometax = income - tax;
    System.out.println("Your income after paying tax is $"+incometax);
    double clothes = incometax * 0.1;
    double incometax1= incometax - clothes;
    System.out.println("The money you spent on buying clothes and other accesories $"+clothes);
    double supplies = incometax1 * 0.01;
    double incometax2 = incometax1 - supplies;
    System.out.println("The money you spent on buying school supplies $"+supplies);
    double bonds = incometax2 * 0.25;
    double incometax3 = incometax2- bonds;
    System.out.println("The money you spent on buying the bonds $"+bonds);
    double parents = incometax3 * 0.50;
    System.out.println("The money your parents spent on buying the bonds $"+parents);

    

    }
}
