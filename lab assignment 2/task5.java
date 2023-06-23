import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a + " " + b + " ");
        for (int i = 3; i <= n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        input.close();
    }
}
