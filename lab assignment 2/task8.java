import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.print("Enter the number:");
            int num = input.nextInt();
            if (num == 0){
                break;
            }
            count++;
        }
        System.out.println("The length of sequence is : "+count);
        input.close();
    }
}
