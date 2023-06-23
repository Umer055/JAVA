import java.util.Scanner;
public interface ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the Cylinder: ");
        double radius = input.nextDouble();
        System.out.print("Enter the length of the Cylinder: ");
        double length = input.nextInt();
        double area = radius * radius * 3.1418;
        double volume = area * length;
        System.out.println("The area is: "+ area);
        System.out.println("The volume is: "+ volume);
        input.close();
    }   
}
