import java.util.Scanner;
public class gradedlab5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total amount of milk produced in the morning : ");
        double milk = input.nextDouble();
        double carton = milk / 3.78;
        System.out.println("The number of cartons required to carry the milk are "+Math.round(carton));
        double cost = milk * 0.38;
        System.out.println("The cost of the mik is $"+cost);
        double profit = carton * 0.27;
        System.out.println("The profit of the mik per carton is $"+profit);



    }
}
