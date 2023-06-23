import java.util.Scanner;
public class gradedlab2 {
    public static void main (String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of students in the class : ");
int students = input.nextInt();
System.out.print("Enter number of Apples : ");
int apples = input.nextInt();
int have = apples / students;
System.out.println("Every student will have : "+have+" Apples");
int remaining = apples -(students * have);
System.out.println("The remaining apples are : "+remaining+" Apples");

    }
}
