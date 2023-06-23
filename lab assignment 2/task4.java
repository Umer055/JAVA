public class task4 {
        public static void main(String[] args) {
            for (int i = 1; i <= 500; i++) {
                int sum = 0;
                int number = i;
    
                while (number != 0) {
                    int digit = number % 10;
                    sum += digit * digit * digit;
                    number /= 10;
                }
    
                if (sum == i) {
                    System.out.println(i);
                }
            }
        }
    }
    

