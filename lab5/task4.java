import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int alteration = 10;
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (alteration > 0){
            if (count != 0) {
                System.out.println("Enter the sequence: ");
                int num = input.nextInt();
                count = count + 1;    

            }
            else {
                System.out.println("The output is : "+count);
                break;
            }
        }
    }
}
