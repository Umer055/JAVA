import java.io.FileWriter;
import java.io.IOException;

public class try_program {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("name1.txt", true);
            fileWriter.write("John Doe\n");
            fileWriter.write("123456789\n");
            fileWriter.write("1234\n");
            fileWriter.write("0\n"); // Initial balance
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Call another method to change the initial balance
        changeInitialBalance("name1.txt", 100.0);
    }

    public static void changeInitialBalance(String fileName, double newBalance) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName, true);
            fileWriter.write(String.valueOf(newBalance) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
