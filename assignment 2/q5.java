import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Welcome to the quiz!!!");
        System.out.println(
                "Q1:\nWho shared the 2007 Nobel Peace Prize in recognition of their efforts to build up and disseminate greater knowledge about man-made climate change?");
        System.out.println("Option1: Al Gore");
        System.out.println("Option2: Donald Trump");
        System.out.println("Option3: Barack Obama");
        System.out.println("Option4: Hillary Clinton");
        int ans1 = input.nextInt();
        if (ans1 == 1) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong");
        }
        System.out.println(
                "Q2:\nWhat is the name of the U.N. network of scientists that shared the 2007 Nobel Peace Prize with Al Gore?");
        System.out.println("Option1: The Intergovernmental Panel on Climate Change");
        System.out.println("Option2: The United Nations Environmental Programme");
        System.out.println("Option3: The World Meteorological Organization");
        System.out.println("Option4: The International Union for Conservation of Nature");
        int ans2 = input.nextInt();
        if (ans2 == 1) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong");
        }
        System.out.println("Q3:\nWho are the global warming skeptics?");
        System.out.println("Option1: People who deny the existence of climate change");
        System.out.println("Option2: People who question the extent and impact of climate change");
        System.out.println("Option3: People who support the use of renewable energy sources");
        System.out.println("Option4:People who believe that global warming is a natural phenomenon");
        int ans3 = input.nextInt();
        if (ans3 == 2) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong");
        }
        System.out.println("Q4:\nWhat are some arguments made by global warming skeptics?");
        System.out.println("Option1: The Earth's climate has always been changing naturally");
        System.out.println("Option2: There is not enough evidence to prove that humans are causing global warming");
        System.out.println("Option3: The costs of reducing greenhouse gas emissions outweigh the benefits");
        System.out.println("Option4: All of the above");
        int ans4 = input.nextInt();
        if (ans4 == 4) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong");
        }
        System.out.println("Q5:\nWhat are some potential consequences of global warming?");
        System.out.println("Option1: Rising sea levels and flooding");
        System.out.println("Option2: More frequent and severe weather events");
        System.out.println("Option3: Increased risk of extinction for many plant and animal species");
        System.out.println("Option4: All of the above");
        int ans5 = input.nextInt();
        if (ans5 == 4) {
            System.out.println("Correct answer");
            result++;
        } else {
            System.out.println("Wrong");
        }
        if (result == 5) {
            System.out.println("EXCELENT");
        } else if (result == 4) {
            System.out.println("VERY GOOD");
        } else if (result <= 3) {
            System.out.println("Time to brush up on your knowledge of global warming");
        }
        input.close();
    }
}
