import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of integers you wanna enter");
        int count = input.nextInt(); 
        int counter = 0;
        while (count > 0 ){
            System.out.println("Enter the number of integers: ");
            int num = input.nextInt();
            if (num == 0){
                counter = counter + 1;
            }
            count--;
        }
        System.out.println("The number of zeros are "+counter);
        input.close();
    }
}
