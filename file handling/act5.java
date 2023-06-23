import java.io.*;
import java.util.Scanner;

public class act5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rno;
        String name;
        int marks;
        try {
            File file = new File("myfile.txt");
            PrintWriter writer = new PrintWriter(file);
            while (true) {
                System.out.print("Enter roll number: ");
                rno = input.nextInt();
                if (rno == 0) {
                    break;
                }
                System.out.print("Name :");
                name = input.next();
                System.out.print("Enter marks : ");
                marks = input.nextInt();
                writer.println(rno);
                writer.println(name);
                writer.println(marks);

            }
            System.out.println("Successfully written.");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error has occured");
            // TODO: handle exception
        }
    }
}
