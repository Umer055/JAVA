import java.util.Scanner;
public class gradedlab7 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int priceA = 20;
    int priceB = 15;
    int priceC = 10;
    int priceD = 5;
    System.out.print("Enter the number of seats sold for class A: ");
    int a = input.nextInt();
    int price1a = (a*priceA);
    sum = sum +price1a;
    System.out.print("Enter the number of seats sold for class B: ");
    int b = input.nextInt();
    int price2b = (b*priceB);
    sum = sum + price2b;
    System.out.print("Enter the number of seats sold for class C: ");
    int c = input.nextInt();
    int price3c = (c*priceC);
    sum = sum + price3c;
    System.out.print("Enter the number of seats sold for class D: ");
    int d = input.nextInt();
    int price4d = (d*priceD);
    sum = sum + price4d;
    System.out.println("The revenue generated for class A are "+price1a);
    System.out.println("The revenue generated for class B are "+price2b);
    System.out.println("The revenue generated for class C are "+price3c);
    System.out.println("The revenue generated for class D are "+price4d);
    System.out.println("The total income generated is $"+sum);
}
}
