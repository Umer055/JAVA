import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double a = input.nextDouble();
        double len = (speed * speed)/(2*a);
        System.out.printf("The minimum runway length for the airplane is %.2f ",len);
input.close();
    }
}
