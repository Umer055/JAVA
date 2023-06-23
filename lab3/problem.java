import java.util.Scanner;
public class problem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of hours worked : ");
        int hours = input.nextInt(); 
        System.out.print("Enter the hourly pay rate : ");
        int payrate = input.nextInt(); 
        if(hours > 40){
            int overtime = hours - 40; 
            int notime = hours - overtime;
            int payrate1 = notime * payrate;
            Double overpayrate = payrate * 1.5;
            Double overpayrate1 = overtime * overpayrate;
            Double overpayrate2 =   overpayrate1 + payrate1; 
            System.out.println("The gross pay of the employee is : " + overpayrate2); 

        }
        else{
            int payrate1 = hours * payrate;
            System.out.println("The gross pay of the employee is : " + payrate1);
        }
        
    }
}
