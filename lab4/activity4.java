import java.util.*;
public class activity4 {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        int score;
        System.out.println("Enter the score: ");
        score = console.nextInt();
        if (score >= 90)
        System.out.println("the grade is A");
        else if (score >= 80)
        System.out.println("the grade is B");
        else if (score >= 70)
        System.out.println("the grade is C");
        else if (score >= 60)
        System.out.println("the grade is D");
        else 
        System.out.println("the grade is F");
    }
}
