package onlineShoppingCart;
import java.util.*;
public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        int itemPrice;
        int itemQuantity;

        String itemName2;
        int itemPrice2;
        int itemQuantity2;

        System.out.println("Hello!!");
        System.out.println("Item 1");
        System.out.println("Enter the Item name: ");
        itemName = scanner.nextLine();
        System.out.println("Enter the Item price: ");
        itemPrice = scanner.nextInt();
        System.out.println("Enter the Item quantity: ");
        itemQuantity = scanner.nextInt();

        ItemToPurchase item1 = new ItemToPurchase(itemName, itemPrice, itemQuantity);

        scanner.nextLine();
        System.out.println("Item 2");
        System.out.println("Enter the Item name: ");
        itemName2 = scanner.nextLine();
        System.out.println("Enter the Item price: ");
        itemPrice2 = scanner.nextInt();
        System.out.println("Enter the Item quantity: ");
        itemQuantity2 = scanner.nextInt();

        ItemToPurchase item2 = new ItemToPurchase(itemName2, itemPrice2, itemQuantity2);

        int item1Cost = item1.getPrice() * item1.getQuantity();
        int item2Cost = item2.getPrice() * item2.getQuantity();
        int totalCost = item1Cost + item2Cost;
        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = " + item1Cost);
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = " + item2Cost);
        System.out.println("Total: $" + totalCost);





    }
}
