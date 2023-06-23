import java.util.Scanner;

public class inclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");     
        int num1 = input.nextInt();
        // System.out.println("Enter the second number: "); 
        // int num2 = input.nextInt();    
        // numbers(0, 0);
        reverse(num1);  
// range();        
    }
    public static void numbers(int num1,int num2){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number and second number");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int temp = num1;
        num1 = num2;
         num2 = temp;
        System.out.println("The first number is "+num1+" The second number is "+num2);
        input.close();

    }



    public static void range(){
        int sum = 0; 
        for (int i = 10; i <= 100; i++) {
            sum += i ; 
        }
        // System.out.println("The sum is"+sum);
    }
        
    public static void reverse(int num1){
        int rev = 0;
        int temp = 0;
        int repeat = 1;
        while (num1 > 0) {
            int rem = num1 % 10;
            rev = rev * 10 + temp;
            num1 = num1 / 10;
            System.out.print(rev);
        
        }
        // return rev
}



    public boolean isPalidrome(int num1){
        int num1=input.nextInt();

    }
}
