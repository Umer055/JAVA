public class labtask2 {

    public static int[] modify(int[] array) {
        int[] modifiedArray = new int[array.length];
        for (int i = 0; i < 10; i++) {
            modifiedArray[i] = array[i] * 3;
        }
        return modifiedArray;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        // modify(array);
        // System.out.println("The modified array is " + modify(array));

        int[] modifiedArray = modify(array);
        System.out.print("The modified array is ");
        for (int i = 0; i < modifiedArray.length; i++) {
            System.out.print(modifiedArray[i] + " ");
        }

    }
}
