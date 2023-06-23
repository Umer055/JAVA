import java.util.*;
public class activity3 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        double wages, rate, hours; //line1
        System.out.println("Line 2: Enter the working "+ "hours: ");
        hours = console.nextDouble();
        System.out.println();
        System.out.println("Line 5: Enter the pay "+ "rate: ");
        rate = console.nextDouble();
        System.out.println();
        if (hours > 40.0)
        wages = 40.0 * rate + 1.5 * rate * (hours - 40.0);
        else
        wages = hours * rate; //line 11
        System.out.printf("Line 12: The wages are $%.2f %n",wages);
        System.out.println();
    }
}
