import java.util.Scanner;
public class gradedlab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students in class 1: ");
        double class1 = input.nextInt();
        System.out.print("Enter the number of students in class 1: ");
        double class2 = input.nextInt();
        System.out.print("Enter the number of students in class 1: ");
        double class3 = input.nextInt();
        double student1 = class1 / 2;
        double student2 = class2 / 2;
        double student3 = class3 / 2;
        double students = Math.round(student1) + Math.round(student2) + Math.round(student3);
        // if(students %2 ==1){
        //     students +=1;
        // }
        System.out.println("The total number of desks required are: "+students);

    }
}