package onlineShoppingCart;
import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // creates variables for 2 items
        String itemName;
        int itemPrice;
        int itemQuantity;

        String itemName2;
        int itemPrice2;
        int itemQuantity2;

        // reads input for first item
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        itemName = scnr.nextLine();
        System.out.println("Enter the item price:");
        itemPrice = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity = scnr.nextInt();
        scnr.nextLine();

        // creates an object for first item
        ItemToPurchase item1 = new ItemToPurchase(itemName, itemPrice, itemQuantity);

        // reads input for second item
        System.out.println();
        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        itemName2 = scnr.nextLine();
        System.out.println("Enter the item price:");
        itemPrice2 = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        itemQuantity2 = scnr.nextInt();

        // creates an object for second item
        ItemToPurchase item2 = new ItemToPurchase(itemName2, itemPrice2, itemQuantity2);

        // calculates and displays the name, price, and quantity of both items
        int item1Cost = item1.getPrice() * item1.getQuantity();
        int item2Cost = item2.getPrice() * item2.getQuantity();
        int totalCost = item1Cost + item2Cost;
        System.out.println();
        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1Cost);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2Cost);
        System.out.println();
        System.out.println("Total: $" + totalCost);


    }
}
