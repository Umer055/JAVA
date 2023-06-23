import java.util.Scanner;

public class practice2 {

    public static void economy() {
        Scanner input = new Scanner(System.in);
        boolean[] economy_array = new boolean[5];
        // economy_array[0] = 1;
        // economy_array[1] = 2;
        // economy_array[2] = 3;
        // economy_array[3] = 4;
        // economy_array[4] = 5;
        for (int i = 0; i < economy_array.length; i++) {

            System.out.println("The seats are  " + (i + 1));
        }
        System.out.print("Enter the seat you want to book  : ");
        int economy_seat = input.nextInt();
        System.out.println("You have booked seat number :  " + economy_array[economy_seat - 1]);
    }

    public static void first_class() {
        Scanner input = new Scanner(System.in);
        boolean[] first_array = new boolean[5];
        // first_array[0] = 6;
        // first_array[1] = 7;
        // first_array[2] = 8;
        // first_array[3] = 9;
        // first_array[4] = 10;
        for (int i = 6; i < 11; i++) {
            if (first_array[i - 6] == false)
                System.out.println("The seats are  " + (i));
        }
        System.out.println(" 1 = seat-6 , 2 = seat-7, 3 = seat-8, 4 = seat-9, 5 = seat-10");
        System.out.print("Enter the seat you want to book  : ");
        int first_seat = input.nextInt();
        first_array[first_seat - 1] = false;
        System.out.println("You have booked seat number :  " + (first_seat + 5));

    }

    public static void again() {
        Scanner input = new Scanner(System.in);
        System.out.println("if you want to book seat again (Y/N)");
        String again_input = input.next();
        int repeat1 = 0;
        while (repeat1 == 0) {
            if (again_input.equals("y")) {
                eco_first();
            } else if (again_input.equals("n")) {
                System.out.println("The next flight is in 3 hours \n thanks for booking!!!!!.....");
                repeat1 = 0;
            }

        }

    }

    public static void eco_first() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 to book in economy and 2 to book in First-class :  ");
        int book = input.nextInt();
        int repeat = 1;
        while (repeat == 1) {

            if (book == 1) {
                economy();
                
            } else if (book == 2) {
                first_class();
                
            } else {
                System.out.println("You have entered the wrong input!!!1");
                repeat = 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("******** Welocome to BOOKING *******");
        eco_first();
        // again();

    }
}
