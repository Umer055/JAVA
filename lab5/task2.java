import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of which you want to get factorial of: ");
        int num = input.nextInt();
        int fac = 1;
        int count =1;
        while(count <= num){
            fac = fac * count;
            
            count = count + 1;
        }
        System.out.println("The factorial is "+fac);
        input.close();
    }
}
