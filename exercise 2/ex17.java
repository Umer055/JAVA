import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double fah = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double wind = input.nextDouble();
        if (fah >= -58 && fah <=41 && wind > 2){
            double temp = 35.74 + 0.6215 * fah - 35.75 * Math.pow(wind, 0.16) + 0.4275 * fah * Math.pow(wind, 0.16);
            System.out.print("The wind chill index is "+ temp);

        }
        else{
            System.out.print("The input is wrong");

        }

input.close();
    }
}
