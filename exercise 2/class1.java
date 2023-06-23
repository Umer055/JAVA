import java.util.Scanner;
public class class1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the money earn in the year: ");
        int earn = input.nextInt();
        System.out.print("for how many years employee has been employeed: ");
        int year = input.nextInt();
        
        if (earn > 30000){
            System.out.print("The employee is earning more than 30,000 ");
            
            if (year > 2){
                System.out.println("The employee has been emplyeed for more than 2 years ");

            }
            else{
                System.out.print("The employee has less experience ");

            }
        }
        else{
            System.out.print("The employee is not earning enough ");

        }
        input.close();
    }
}
