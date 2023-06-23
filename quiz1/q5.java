public class q5 {
    public static void main(String[] args) {
        int number1 = 1;
        double number2 = Math.pow(number1, 2);
        number2 = (int)number2;
        System.out.println("110");
        for (number2 = 100; number1 <= 150; number1++){
            number2 = (number1*number1);
            if (number2 > 12000) {
                System.out.println("the output is: "+number2);
                number1 = 151;
            }
        }
    }
}
