import java.util.Scanner;
public class Grd3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int [] answer = reverse(array);
        for(int i = 0; i < answer.length; i++) {
            System.out.println("The elements of new array are: " + answer[i]);
        }
    }
    public static int [] reverse(int [] array) {
        int a = array.length;
        int [] rev = new int[a];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--) {
            rev[j] = array[i];
            j++;
        }
        return rev;
    }
}