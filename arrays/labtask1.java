import java.util.Scanner;

public class labtask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] array3 = new int[10];
        int[] array4 = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("The student" + i + "answer: ");
            System.out.println("Q1 : How is the cafe: ");
            int q1 = input.nextInt();
            System.out.print(" Q2 : How is the chat: ");
            int q2 = input.nextInt();
            System.out.print("Q3 : How is the tea: ");
            int q3 = input.nextInt();
            System.out.print("Q4 : How is the milkshake: ");
            int q4 = input.nextInt();

            array1[i] = q1;
            array2[i] = q2;
            array3[i] = q3;
            array4[i] = q4;
            if (q1 < 11 || q2 < 11 || q3 < 11 || q4 < 11) {
            }
            for (int j = 0; j < array4.length; j++) {

                System.out.println(array1[j]);
                System.out.println(array2[j]);
                System.out.println(array3[j]);
                System.out.println(array4[j]);
            }
        }
    }
}
