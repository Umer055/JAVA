import java.util.Scanner;

public interface activity4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //declare the variables
        int num;
        int guess;
        boolean done;
        num = (int)(Math.random()*100);
        done = false;
        while(!done){
            System.out.println("Enter an integer greater"+" than or equal to 0 and "+"less than 100:");
            guess = input.nextInt();
            System.out.println();
        
        if (guess == num){
            System.out.println("You guessed the "+"correct number.");
            done = true;
        }
        else if (guess < num){
            System.out.println("Your guess is "+"Lower than "+"the number.\n"+"Guess again!");

        }
        else {
            System.out.println("Your guess is "+"higher than "+"the number.\n"+"Guess again!");

        }}
        input.close();
    }
}
