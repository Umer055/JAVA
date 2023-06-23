import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        int[][] multi_array = new int[3][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print("Enter the integer for 1st array : ");
                array1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print("Enter the integer for the 2nd array : ");
                array2[i][j] = input.nextInt();
            }
        }

        for (int j = 0; j < array2.length; j++) {
            for (int j2 = 0; j2 < array2[j].length; j2++) {
                multi_array[j][j2] = array1[j][j2] * array2[j][j2];
            }

        }
        for (int j = 0; j < multi_array.length; j++) {
            for (int j2 = 0; j2 < multi_array[j].length; j2++) {
                System.out.println(multi_array[j][j2]);

            }
        }
    }
}