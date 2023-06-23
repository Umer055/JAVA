import java.io.*;
import java.io.File;

public class act3 {
    public static void main(String[] args) {
        int rno = 101;
        String name = "umer";
        int marks = 88;
        try {
            File file = new File("name.txt");
            PrintWriter writer = new PrintWriter(file);
            writer.println(rno);
            writer.println(name);
            writer.println(marks);
            System.out.println("Successfully written.");
            writer.close();
        } catch (Exception e) {
            System.out.println("An error has occured");
        }
    }
}
