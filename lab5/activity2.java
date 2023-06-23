import java.util.Scanner;


public class activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit;
        int number;
        int sum;
        int counter; //loop control variable 
        System.out.println("Enter the number of "+"integers in the list:");
        limit = input.nextInt();
        System.out.println();
        sum = 0;
        counter = 0;
        System.out.println("Enter "+"limit"+" integers.");
        while (counter < limit){
            number = input.nextInt();
            sum = sum + number;
            counter++;
        }
        System.out.printf("The sum of the %d "+"numbers = %d%n",limit,sum);
        if (counter != 0){
            System.out.printf("The average - %d%n",(sum/counter));
        }
        else
            {System.out.println("NO input.");}
        input.close();
    }
}
