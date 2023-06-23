public class df {
    public static void main(String[] args) {
        int size = 5;
        char[] arr = createArrayOfA(size);
        printArray(arr);
    }

    public static char[] createArrayOfA(int size) {
        char[] arr = new char[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 'A';
        }
        return arr;
    }

    public static void printArray(char[] arr) {
        for (char element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
