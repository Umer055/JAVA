import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class inclass {
    public static void main(String[] args) {

        try {
            File file = new File("name1.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String fname = input.nextLine();
                String mname = input.nextLine();
                int age = input.nextInt();

                System.out.println(fname + " " + mname + " " + age);
            }
            input.close();

        } catch (IOException e) {
            System.out.println("Error in reader");
        }
    }
}
