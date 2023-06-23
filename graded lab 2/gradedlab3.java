import java.util.Scanner;
public class gradedlab3
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args)
    {
        String name;
        System.out.println("enter the name=");
        name=input.next();
        double rate=12.50;
        double hoursworked;
        System.out.println("enter the hours you worked=");
        hoursworked=input.nextDouble();
        double wages;
        wages=hoursworked*rate;
        int secret=11;
        int num1;
        int num2;
        int newNum;
        System.out.println("enter two integers=");
        num1=input.nextInt();
        num2=input.nextInt();
        System.out.println("The value of number 1 is= "+num1+" and number 2 is= "+num2);
        int x;
        x=(num1*2);
        newNum=(x+num2);
        System.out.println("the new number is= "+newNum);
        newNum=secret;
        System.out.println("the new value of newnum is="+newNum);
        System.out.println("Name="+name+"\nPay Rate="+rate+"\nHours Worked="+hoursworked+"\nSalary="+wages);
    }
} 
    

