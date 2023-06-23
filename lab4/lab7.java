import java.util.Scanner;
public class lab7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length and width of the first rectangle: ");
        double length1 = input.nextDouble();
        double width1 = input.nextDouble();
        System.out.print("Enter the length and width of the second rectangle: ");
        double length2 = input.nextDouble();
        double width2 = input.nextDouble();
        double rectangle1 = length1 * width1;
        double rectangle2 = length2 * width2;
        if (rectangle1 > rectangle2)
        System.out.println("Rectangle 1 has greater area");
        else if (rectangle2 > rectangle1)
        System.out.println("Rectangle 2 has greater area");
        else
        System.out.println("Both have same area!!");
input.close();
    }
}
