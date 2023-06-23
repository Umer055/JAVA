
public class q3 {
    public static void main(String[] args) {
        char alphabet1 = (char) (65 + Math.random() * 26);
        char alphabet2 = (char) (65 + Math.random() * 26);
        char alphabet3 = (char) (65 + Math.random() * 26);
        String letters = "" + alphabet1 + alphabet2 + alphabet3;
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);
        System.out.println(letters + number1 + number2 + number3);
    }
}
