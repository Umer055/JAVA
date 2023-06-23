import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        while (true){
            System.out.print("Enter the number:");
            int num = input.nextInt();
            if (num == 0){
                break;
            }
            if (num > largest){
                largest = num;
            }
        }
        System.out.println("The largest number is: "+largest);
        input.close();
    }
}
