import java.util.Scanner;

public class practive1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the " + i + " number of the array: ");
            while (array[i] < 10 || array[i] > 100) {
                array[i] = input.nextInt();
            }
            check(array, i, array[i]);
        }
        System.out.println("The input array is. . . . ");
        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
            sum = sum + array[i];
        }

        // for (int i = 0; i < array.length; i++) {
        // }

        System.out.println("The sum of the array is " + sum);
    }

    public static void check(int[] array, int i, int val) {
        for (int k = 0; k < 5; k++) {
            if (k != i)
                if (array[k] == val) {
                    array[i] = 0;
                }
        }
    }
}
