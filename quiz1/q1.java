import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat = 1;
        while (repeat == 1){
            System.out.print("Enter the height of the father: ");
            int father = input.nextInt();
            System.out.print("Enter the height of the mother: ");
            int mother = input.nextInt();
        System.out.print("Enter the gender of the child (0) for girls and (1) for boy: : ");
        int gender = input.nextInt();
        if (gender==1) {
            System.out.println("you have entered a boy");
            int height = ((mother * 13/12)+father)/2;
            System.out.println("The height of the male child will be: "+height);

        }
        if(gender == 0){
            System.out.println("You have entered a female");
            int height = ((father * 12/13)+mother)/2;
            System.out.println("The height of the female child will be: "+height);
            
        }
        System.out.print("Enter 0 to terminate the program and 1 to input again: ");
         repeat = input.nextInt();

        }
        input.close();
    }
}