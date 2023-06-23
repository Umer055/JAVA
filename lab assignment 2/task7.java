import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total inputs you wanna enter: ");
        int n = input.nextInt();
        int zero = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Enter the number:");
            int num = input.nextInt();
            if (num == 0){
                zero++;
            }
        }
        System.out.println("The number of zero's are "+zero);
        input.close();
    }
}
