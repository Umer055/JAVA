import java.util.InputMismatchException;
import java.util.Scanner;

public class q4 {
    private static int[] arr;
    private static int length;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Array");
        int length = input.nextInt();
        int[] my_array = new int[length];

        System.out.println("Enter the elements in an Array");
        for (int i = 0; i < my_array.length; i++) {
            my_array[i] = input.nextInt();
        }

        int choice;
        do {
            System.out.println("\n------ Menu ------");
            System.out.println("1. Count occurrences of a number");
            System.out.println("2. Partition the array");
            System.out.println("3. Calculate element frequencies");
            System.out.println("4. Replace elements in a circular manner");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to count occurrences: ");
                    int number = input.nextInt();
                    int count = count(number);
                    System.out.println("Occurrences of " + number + ": " + count);
                    break;
                case 2:
                    System.out.print("Enter the partition number: ");
                    int partitionNumber = input.nextInt();
                    // partition(partitionNumber);
                    // System.out.println("Array after partition: " + arrayToString());
                    break;
                case 3:
                    // duplicates();
                    int a = 0;
                    int b = 0;
                    int c = 0;
                    int d = 0;
                    int e = 0;
                    int f = 0;
                    int g = 0;
                    int h = 0;
                    int j = 0;
                    int k = 0;
                    for (int i = 0; i < my_array.length; i++) {
                        if (my_array[i] == 0) {
                            a++;
                        } else if (my_array[i] == 1) {
                            b++;
                        } else if (my_array[i] == 2) {
                            c++;
                        } else if (my_array[i] == 3) {
                            d++;
                        } else if (my_array[i] == 4) {
                            e++;
                        } else if (my_array[i] == 5) {
                            f++;
                        } else if (my_array[i] == 6) {
                            g++;
                        } else if (my_array[i] == 7) {
                            h++;
                        } else if (my_array[i] == 8) {
                            j++;
                        } else if (my_array[i] == 9) {
                            k++;
                        }
                    }
                    System.out.println("the number of 0 in the Arry are " + a);
                    System.out.println("the number of 1 in the Arry are " + b);
                    System.out.println("the number of 2 in the Arry are " + c);
                    System.out.println("the number of 3 in the Arry are " + d);
                    System.out.println("the number of 4 in the Arry are " + e);
                    System.out.println("the number of 5 in the Arry are " + f);
                    System.out.println("the number of 6 in the Arry are " + g);
                    System.out.println("the number of 7 in the Arry are " + h);
                    System.out.println("the number of 8 in the Arry are " + j);
                    System.out.println("the number of 9 in the Arry are " + k);

                    break;
                case 4:
                    circular();
                    System.out.println("Array after circular replacement: " + arrayToString());
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        input.close();
    }

    private static int count(int x) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    private static void partition(int x) {
        int i = 0;
        int j = length - 1;

        while (i < j) {
            while (arr[i] < x) {
                i++;
            }
            while (arr[j] > x) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }

    private static void circular() {
        for (int i = 0; i < length; i++) {
            int nextIndex = (i + 1) % length;
            int nextNextIndex = (i + 2) % length;
            arr[i] = arr[nextIndex] + arr[nextNextIndex];
        }
    }

    private static String arrayToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < length; i++) {
            sb.append(arr[i]);
            if (i < length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
