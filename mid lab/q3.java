import java.util.Scanner;

public class q3 {

    public static void sequece() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number N : ");
        double num = input.nextInt();
        double equation = 0;
        double sum = 0;
        if (num < 21 && num > 1) {
            for (int i = 1; i <= num; i++) {
                equation = Math.pow(i, i);
                sum += equation;
            }
            System.out.println("The equation will become : " + sum);
        } else {
            System.out.println("The input number should be greater than 1 and less than 21");
        }
        input.close();
    }

    public static void main(String[] args) {
        sequece();
    }
}
