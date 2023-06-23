import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even = 0;
        while (true){
            System.out.print("Enter the number:");
            int num = input.nextInt();
            if (num == 0){
                break;
            }
            if (num %2 == 0){
                even++;
            }
        }
        System.out.println("The number of even's are: "+ even);
        input.close();
    }
}
