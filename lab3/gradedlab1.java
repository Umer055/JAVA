import java.util.Scanner;
public class gradedlab1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any amount : ");
        double num = input.nextDouble();
        double cents = num * 100;
        System.out.println("The amount of Cents are : "+ cents );
        System.out.println("The amount of Dollars are : "+ num );
        double quarters = cents /25;
        System.out.println("The amount of Quaters are : "+ quarters );
        double cents1 = cents % 25;
        System.out.println("The remaining Cents are : "+ cents1 );
        double dimes = cents1 / 10;
        System.out.println("The amount of Dimes are : "+ dimes );
        double cents2 = cents1 % 10;
        System.out.println("The remaining Cents are : "+ cents2 );
        double nickels = cents2 / 5;
        System.out.println("The amount of nickels are : "+ nickels );
        double pennies = cents2 % 5;
        System.out.println("The remaining Pennies are : "+ pennies );






    }
}
