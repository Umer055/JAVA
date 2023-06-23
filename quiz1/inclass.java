import java.util.Scanner;

public class inclass {
    public static void main(String[] args) {
        sum();
        System.out.println();
    }
    public static void sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double per = (a + b)/2;
        System.out.println(per);
    }
}
