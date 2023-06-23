import java.util.Scanner;
public class gradedlab4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minutes passed since midnight: ");
        int min = input.nextInt();
        int hours = min/60;
        int remainingmin = min %60;
        System.out.println("The time is "+hours+":"+remainingmin);
    }
}
