import java.util.Scanner;
public class Q2
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int size = input.nextInt();
        System.out.println("Enter the elements in matrix: ");
        int[][] array1 = new int[size][size];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                double random = Math.random() * 2;
                array1[i][j] = (int) random;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }

            Row(array1);
            Cols(array1);
            Diagonal(array1);
    }
    public static void Row(int [][] array) {
        int sum = 0;
        int i;
        for (i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++){
                sum += array[i][j];
            }
            if (sum == 0){
                System.out.println("All 0s on row " + (i));
            }
            else if (sum == array.length) {
                System.out.println("All 1s on row " + (i));
            }
            else
                System.out.println("No same numbers on row");
            sum = 0;
        }

        }

    public static void Cols(int [][] array) {
        int sum = 0;
        int j;
        for (j = 0; j< array.length; j++) {
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            if (sum == 0){
                System.out.println("All 0s on columns " + (j + 1));
            }
            else if (sum == array.length) {
                System.out.println("All 1s on columns " + (j + 1));
            }
            else
                System.out.println("No same numbers on column");
            sum = 0;
        }

        }
    public static void Diagonal(int [][] array) {
        int sum = 0;
        for (int i = 0; i< array.length; i++){
            for (int j = 0; j< array.length; j++) {
                if (i == j) {
                    sum += array[i][j];

                }
            }
        }
        if (sum == 0) {
            System.out.println("All 0s on diagonal ");
        }
        else if (sum == array.length) {
            System.out.println("All 1s on columns " );
        }
        else {
            System.out.println("No same number on major diagonal");
            System.out.println("No same number on sub diagonal");
        }
    }
}
