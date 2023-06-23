import java.io.*;
import java.util.Scanner;

public class act6 {
    public static void main(String[] args) {
        try {
            File obj = new File("myfile.txt");
            Scanner reader = new Scanner(obj);                         
            while (reader.hasNext()) {
                int rno = reader.nextInt();
                System.out.println("R. NO ="+rno);
                String name = reader.next();
                System.out.println("Name= " + name);
                int marks = reader.nextInt();
                System.out.println("Marks = " + marks);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occured.");
            // TODO: handle exception
        }
    }
}
