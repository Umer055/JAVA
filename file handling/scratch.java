import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class scratch {

    public static void main(String[] args) {
        
        
        try {

            File file = new File("name1.txt");
            PrintWriter output = new PrintWriter(file);

            output.println("Umer Farooq");
            output.println("Umer");
            output.print(45);
            output.close();
        } catch (Exception e) {
            System.out.println("File not written");
        }
    }
}