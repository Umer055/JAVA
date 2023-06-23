import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subject (M,C,I): ");
        String enter = input.next();
        System.out.print("Enter the student (1=freshman , 2=sophomore , 3=junior , 4=senior): ");
        int student = input.nextInt();
        if (enter.equals("M") || enter.equals("m")) {
            if (student == 1) {
                System.out.println("Mathematics Freshman");
            } else if (student == 2) {
                System.out.println("Mathematics sophomore");
            } else if (student == 3) {
                System.out.println("Mathematics junior");
            } else if (student == 4) {
                System.out.println("Mathematics senior");
            }
        } else if (enter.equals("C") || enter.equals("c")) {
            if (student == 1) {
                System.out.println("Computer Science freshman");
            } else if (student == 2) {
                System.out.println("Computer Science sophomore");
            } else if (student == 3) {
                System.out.println("Computer Science junior");
            } else if (student == 4) {
                System.out.println("Computer Science senior");
            }
        } else if (enter.equals("I") || enter.equals("i")) {
            if (student == 1) {
                System.out.println("Information Technology freshman");
            } else if (student == 2) {
                System.out.println("Information Technology sophomore");
            } else if (student == 3) {
                System.out.println("Information Technology junior");
            } else if (student == 4) {
                System.out.println("Information Technology senior");
            }
        } else {
            System.out.println("Wrong input!!!");
        }
        input.close();

    }
}
