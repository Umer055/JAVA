import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double xvalue = x2 - x1;
        double xpower = Math.pow(xvalue, 2);
        double yvalue = y2 - y1;
        double ypower = Math.pow(yvalue, 2);
        double value = xpower + ypower;
        double end = Math.sqrt(value);
        System.out.print("The distance between two points is "+end);
input.close();
    }
}
