import java.util.Scanner;

public class q23 {
    private static int[] arr;
    private static int size;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
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
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number to count occurrences: ");
                    int number = scanner.nextInt();
                    int count = count(number);
                    System.out.println("Occurrences of " + number + ": " + count);
                    break;
                case 2:
                    System.out.print("Enter the partition number: ");
                    int partitionNumber = scanner.nextInt();
                    partition(partitionNumber);
                    System.out.println("Array after partition: " + arrayToString());
                    break;
                case 3:
                    duplicates();
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

        scanner.close();
    }

    private static int count(int x) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    private static void partition(int x) {
        int i = 0;
        int j = size - 1;

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

    private static void duplicates() {
        int[] frequency = new int[size];
        boolean[] visited = new boolean[size];

        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                frequency[i] = count;
            }
        }

        System.out.println("Element frequencies:");
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                System.out.println(arr[i] + " : " + frequency[i]);
            }
        }
    }

    private static void circular() {
        for (int i = 0; i < size; i++) {
            int nextIndex = (i + 1) % size;
            int nextNextIndex = (i + 2) % size;
            arr[i] = arr[nextIndex] + arr[nextNextIndex];
        }
    }

    private static String arrayToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
