import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class shopping_cart_APP extends JFrame {

    public shopping_cart_APP(String array[]) {

        super("Array Printer");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        StringBuilder sb = new StringBuilder();

        sb.append("\t CARLOAD FRUIT SHOP \n\n");

        sb.append("No\tItem\t Price\n");
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == null)

                break;

            int price = fruit_prices(array[i]);

            sum = sum + price;

            sb.append(i + 1).append(" \t").append(array[i]).append("\t").append(price).append("\n");
        }
        sb.append("\n\tYOUR TOTAL BILL : ").append(sum).append("Rs/-").append("\n");
        sb.append("\tTHANKYOU");
        JTextArea textArea = new JTextArea(sb.toString());
        add(textArea);

    }

    public static void display(String x[]) {
        for (int row = 0; row < x.length; row++) {
            if (x[row] == null)
                break;
            System.out.println(row + "\t" + x[row] + " Rs/- " + fruit_prices(x[row]));
        }
    }

    public static void fruit_names() {
        System.out.println("\tFOLLOWING ARE THE SHOP ITEMS\n");

        String[] fruit_names = { "banana", "pineapple", "mango", "citrus", "apple", "grapes", "pomegranate", "guava",
                "date", "apricot", "peach", "pear",
                "plum", "almond", "fig", "jaman", "litchy", "phalsa", "walnut", "ber", "loquat", "mulberry",
                "strawberry", "chikoo", "coconut", "cherry", "pistachio", "papaya", "percimen", "melon", "watermelon",
                "orange" };

        for (int i = 0; i < fruit_names.length; i++) {
            if (i % 6 == 0) {
                System.out.println("");
            }

            System.out.print(fruit_names[i] + " (Rs/-" + fruit_prices(fruit_names[i]) + ")" + "\t");
        }
        System.out.println("\n");
    }

    public static Integer fruit_prices(String x) {

        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("peach", 30);
        fruitPrices.put("mango", 50);
        fruitPrices.put("orange", 12);
        fruitPrices.put("apple", 30);
        fruitPrices.put("cherry", 5);
        fruitPrices.put("date", 10);
        fruitPrices.put("pineapple", 15);
        fruitPrices.put("citrus", 15);
        fruitPrices.put("grapes", 25);
        fruitPrices.put("pomegranate", 40);
        fruitPrices.put("banana", 10);
        fruitPrices.put("guava", 20);
        fruitPrices.put("plum", 25);
        fruitPrices.put("almond", 60);
        fruitPrices.put("jaman", 5);
        fruitPrices.put("litchy", 10);
        fruitPrices.put("phalsa", 15);
        fruitPrices.put("ber", 10);
        fruitPrices.put("mulberry", 10);
        fruitPrices.put("strawberry", 30);
        fruitPrices.put("coconut", 35);
        fruitPrices.put("pistachio", 20);
        fruitPrices.put("papaya", 25);
        fruitPrices.put("percimen", 15);
        fruitPrices.put("melon", 25);
        fruitPrices.put("apricot", 25);
        fruitPrices.put("pear", 20);
        fruitPrices.put("fig", 10);
        fruitPrices.put("walnut", 30);
        fruitPrices.put("loquat", 25);
        fruitPrices.put("chikoo", 15);
        fruitPrices.put("watermelon", 45);

        return fruitPrices.get(x);
    }

    public static String[] removeTheElement(String[] arr, String name) {

        // Create another array of same size
        String[] anotherArray = new String[arr.length];
        // Copy the elements except the index from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (arr[i] != null) {
                if (arr[i].equals(name)) {
                    continue;
                }
            }
            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }

    public static void saveToFile(String filename, String arr[]) {
        try {
            File file = new File(filename);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("\tINVOICE\n");
            writer.write("item name\tprice");
            writer.newLine();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null)
                    break;
                int price = fruit_prices(arr[i]);
                sum = sum + price;
                writer.write(arr[i] + "\t\t" + price);
                writer.newLine();
            }
            writer.write("\tyour total bill : " + sum + "Rs/-");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] managing_cart(String cart[], int size) {
        List<String> shop_items = List.of("apple", "orange", "banana", "cherry", "date", "pineapple", "mango", "citrus",
                "grapes", "pomegranate", "guava", "peach",
                "plum", "almond", "jaman", "litchy", "phalsa", "ber", "mulberry", "strawberry", "coconut", "pistachio",
                "papaya", "percimen", "melon", "apricot");
        List<String> outofstock_items = List.of("pear", "fig", "walnut", "loquat", "chikoo", "watermelon");
        Scanner s = new Scanner(System.in);

        String item;
        int k = 0;
        System.out.println(
                "YOU CAN ADD MAXIMUM 10 ITEMS IN THE CART (enter done to finish and enter remove to delete item from cart)\n");
        System.out.println("ENTER THE ITEMS YOU WANT TO ADD IN THE CART");
        for (int j = 0; j < size; j++) {
            item = s.nextLine();
            item = item.toLowerCase();

            if (item.equals("done")) {
                break;
            } else if (item.equals("remove")) {
                // check if cart is empty, k is the no of items in cart
                if (k == 0) {
                    // infinite loop which will be breaked when we add item in the cart or if we
                    // want to finish
                    while (k == 0) {
                        System.out.println("There is no item in the cart, kindly add item or enter done to finish");
                        item = s.nextLine();
                        item = item.toLowerCase();
                        if (item.equals("done")) {
                            break;
                        } else if (item.equals("remove")) {
                            k = 0;
                        } else {
                            if (shop_items.contains(item)) {
                                cart[k] = item;
                                k++;
                            } else if (outofstock_items.contains(item)) {
                                System.out.println("!!!" + item + " is out of stock");
                            } else {
                                System.out.println("!!! This Shop is of fruits kindly enter listed above fruits!!!");
                            }

                        }
                    }
                } else {

                    System.out.println("enter the name of the item you want to remove from the cart");
                    System.out.println("number \t item");
                    display(cart);
                    String fruit_name = s.nextLine();
                    fruit_name = fruit_name.toLowerCase();
                    boolean check = true;
                    while (check == true) {
                        for (int a = 0; a < cart.length; a++) {
                            if (cart[a] == null) {
                                break;
                            } else if (cart[a].equals(fruit_name)) {
                                size = size + 2;
                                cart = removeTheElement(cart, fruit_name);
                                System.out.println(fruit_name + " is removed from the cart");
                                System.out.println("enter done to finish or add more items in your cart");
                                k--;

                                check = false;
                                break;
                            }
                        }

                        if (check == true) {
                            System.out.println("!!!This item doesn't exist in the cart!!!");
                            System.out.println(
                                    "!!!Kindly, enter the correct name of item to be removed from your cart!!!");
                            fruit_name = s.nextLine();
                            fruit_name = fruit_name.toLowerCase();
                        } else {
                            break;
                        }

                    }
                }
            } else {
                if (shop_items.contains(item)) {
                    cart[k] = item;
                    k++;
                } else if (outofstock_items.contains(item)) {
                    System.out.println("!!!" + item + " is out of stock");
                    System.out.println("Add other items or enter Done to finish");
                    size = size + 1;
                } else {
                    System.out.println("!!! This Shop is of fruits kindly enter listed above fruits!!!");
                    size = size + 1;
                }
            }

        }
        return cart;

    }

    public static void main(String[] args) {
        fruit_names();
        int size = 10;
        String[] cart = new String[size];

        cart = managing_cart(cart, size);

        // display cart with bill in GUI
        shopping_cart_APP window = new shopping_cart_APP(cart);
        window.setVisible(true);
        saveToFile("bill.txt", cart);

    }

}