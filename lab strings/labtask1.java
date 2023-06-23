import java.util.Scanner;

public class labtask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x1_rad = Math.toRadians(x1);
        double y1_rad = Math.toRadians(y1);
        double x2_rad = Math.toRadians(x2);
        double y2_rad = Math.toRadians(y2);
        double d = 6371.01 * Math.acos(Math.sin(x1_rad) * Math.sin(x2_rad)
                + Math.cos(x1_rad) * Math.cos(x2_rad) * Math.cos(y1_rad - y2_rad));
        System.out.println("The distance between the two points are " + d + " KM");
        input.close();
    }
}
