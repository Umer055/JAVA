import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the square matrix");
        int length = input.nextInt();
        int[][] square = new int[length][length];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                double randomnumber = Math.random() * 2;
                square[i][j] = (int) randomnumber;
            }
        }
        for (int i = 0; i < square.length; i++) {
            System.out.println();
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j]);
            }
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                sum = sum + square[i][j];
            }
            if (sum == 0) {
                System.out.println("The matrix row " + i + " has all zeros");
            } else if (sum == square.length) {
                System.out.println("The matrix row " + i + " has all ones");
            } else {
                System.out.println("NO same ones or zeros in row " + i);
            }
            sum = 0;
        }

        for (int k = 0; k < 2; k++) {
        for (int i = 0; i < square.length; i++) {
        if (columnSequence(square, k, i)) {
        System.out.println("All " + k + "s on column " + i);
        column++;
        }
        }
    }

    public static boolean columnSequence(int[][] m, int n, int column) {

        for (int i = 0; i < m.length; i++) {
            if (m[i][column] != n)
                return false;
        }
        return true;
    }
}
