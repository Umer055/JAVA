import java.util.Scanner;

public class labtask2 {
    public static int reverse(int num){
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev *10 + digit;
            num /= 10;
}
        System.out.println("The reverse of the number is "+rev);        
    return rev;
    }  
    public static int isPalindrome(int num1){
        if(reverse(num1)==num1)
    {System.out.println("Its also a palindrom");}
return num1;    
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer");
        int num = input.nextInt();
        reverse(num);
        isPalindrome(num);
    }
}
