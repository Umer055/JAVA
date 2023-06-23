import java.util.*;
public class activity3 {
static Scanner console = new Scanner (System.in);
public static void main(String[] args){

String firstname;
String lastname;
int age;
double weight;
System.out.println("Enter first name, last name,"+ "age, and weight seperated "+"by spaces.");
firstname = console.next();
lastname = console.next();
age = console.nextInt();
weight = console.nextInt();
System.out.print("Name:"+firstname+ " "+ lastname);
System.out.print(" Age: "+ age);
System.out.print (" Weight:"+weight);
}
}