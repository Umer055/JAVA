import java.util.Scanner;
public class activity5 {
public static void main(String[] args) {
final double PI = 3.1413;
Scanner input = new Scanner(System.in);
System.out.print ("enter a number for the radius: ");
double radius=input.nextDouble();
double area = radius * radius * PI;
System.out.print ("the area for the circle of radius" + radius +"is "+ area);
}
}