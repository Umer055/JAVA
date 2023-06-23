import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        String[] my_array = { "b", "a", "b", "a", "c", "a", "b", "c", "c", "c", "b", "a", "c" };
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i].equals("a")) {
                a++;
            } else if (my_array[i].equals("b")) {
                b++;
            } else if (my_array[i].equals("c")) {
                c++;
            }
        }

        Arrays.sort(my_array);
        for (int i = 0; i < my_array.length; i++) {
            System.out.println((my_array[i]));

        }
        System.out.println("the number of a in the matrix are " + a);
        System.out.println("the number of b in the matrix are " + b);
        System.out.println("the number of c in the matrix are " + c);
    }

}
