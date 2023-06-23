import java.util.Scanner;
public class task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int above = 0;
        int count = 0;
        while (true){
            System.out.print("Enter the number:");
            int num = input.nextInt();
            if (num == 0){
                break;
            }
            if (num > above){
                above = num;
                count++;
            }
        }
        System.out.println("The answer is:"+count);
        input.close();
    }
}
