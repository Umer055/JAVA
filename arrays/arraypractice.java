// import java.net.SocketTimeoutException;
// import java.util.Scanner;

// public class arraypractice {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int x1;
// int x2;
// int x3;
// int x4;
// int x5;

// double[] array_double = new double[5];
// char[] array_char = new char[5];
// workwithArray();

// public static void workwithArray() {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the size of the array: ");
// int size = scanner.nextInt();

// int[] array = new int[size];

// System.out.println("Enter the values for the array:");
// for (int i = 0; i < size; i++) {
// System.out.print("Enter value " + (i + 1) + ": ");
// array[i] = scanner.nextInt();
// }
// }

// int[] a = new int[5];
// a[0] = 9;
// a[1] = 8;
// a[2] = 3;
// a[3] = 7;
// a[4] = 6;
// System.out.println(sumarray(a));
// }

// public static int sumarray(int[] array) {
// int sum = 0;
// for (int i = 0; i < array.length; i++) {
// sum = sum * array[i];
// }
// return sum;
// check_even(a);
// System.out.println("The number of even numbers are " + check_even(a));
// int[] x = reverse_array(a);
// for (int i = 0; i < x.length; i++) {

// System.out.println("The reversed array is " + x[i]);
// }

// w[0][0] = 1;
// w[0][1] = 1;
// w[0][2] = 1;
// w[0][3] = 1;
// w[1][0] = 1;
// w[1][1] = 1;
// w[1][2] = 1;
// w[1][3] = 1;
// w[2][0] = 1;
// w[2][1] = 1;
// w[2][2] = 1;
// w[2][3] = 1;
// int w [[0][0];[0][1];[0][2]
// [1][0];[1][1];[1][2]
// ]

// int w[][] = new int[2][3];
// how to take input in arrray
// for (int i = 0; i <= 2; i++) {
// for (int j = 0; j < 3; j++) {
// System.out.println("Enter:");
// w[i][j] = input.nextInt();
// }
// }

// int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
// int sum = 0;
// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 2; j++) {
// sum += array[i][j];
// }
// }
// System.out.println(sum);

// }
// }
// public static int check_even(int[] a) {
// int count = 0;
// for (int i = 0; i < a.length; i++) {
// if (a[i] % 2 == 0) {
// count++;
// }

// }
// return count;
// }

// public static int[] reverse_array(int[] a) {
// int size = a.length;
// int array[] = new int[size];
// int j = 0;
// for (int i = array.length - 1; i >= 0; i--) {
// array[j] = a[i];
// j++;
// }
// return array;

// }

// public static int array_input(int[] a){
// for (int i = 0; i < a.length; i++) {
// System.out.println(a[i]);
// }
// }

// }