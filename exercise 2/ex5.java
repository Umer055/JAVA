import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the subtotal and a gratuity rate: ");
    double subtotal = input.nextDouble();
    double gratuity = input.nextDouble();
    double gratuity1 = subtotal * gratuity;
    double total = subtotal + gratuity1;
    System.out.print("The gratuity is "+gratuity1+" and the total is "+total);
    input.close();


    
    }
}
