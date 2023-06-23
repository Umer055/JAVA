import java.util.Scanner;
public class class2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        switch (year % 6) {
            case 0:
            System.out.println("The animal of the year is monkey");
            break;
            case 1:
            System.out.println("The animal of the year is rooster");
            break;
            case 2:
            System.out.println(" the animal of the year is dog");
            break;
            case 3:
            System.out.println("the animal of the year is pig");
            break;
            case 4:
            System.out.println("the animal of the year is rat");
            break;
            case 5:
            System.out.println("the animal of the year is ox");
            break;
            default:
            System.out.println("Your input is wrong");
        }
        input.close();
    }
}
