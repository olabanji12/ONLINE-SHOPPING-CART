package onlineShoppingCart;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShoppingCartManager {
    public static void printMenu(){
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
    }

    public static void executeMenu(char choice, ShoppingCart newCart, Scanner scan) {
        if(choice == 'o'){
            System.out.println("OUTPUT SHOPPING CART");
            newCart.printTotal();
        }
        else if(choice == 'i'){
            System.out.println("OUTPUT SHOPPING CART");
            newCart.printDescriptions();
        }
        else if(choice == 'a'){
            System.out.println("ADD ITEM TO CART");
            System.out.println("Enter the item name:");
            String name = scan.nextLine();
            System.out.println("Enter the item description:");
            String description = scan.nextLine();
            System.out.println("Enter the item price:");
            int price = scan.nextInt();
            System.out.println("Enter the item quantity:");
            int quantity = scan.nextInt();
            ItemToPurchase item = new ItemToPurchase(name, description, price, quantity);
            newCart.addItem(item);
        }
        else if(choice == 'd'){
            System.out.println("REMOVE ITEM FROM CART");
            System.out.println("Enter name of item to remove:");
            String name = scan.nextLine();
            newCart.removeItem(name);
        }
        else if(choice == 'c'){
            System.out.println("CHANGE ITEM QUANTITY");
            System.out.println("Enter the item name:");
            String name = scan.nextLine();
            System.out.println("Enter the new quantity:");
            int quantity = scan.nextInt();
            ItemToPurchase item = new ItemToPurchase();
            item.setName(name);
            item.setQuantity(quantity);
            newCart.modifyItem(item);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String custName;
        char userChoice;
        String currDate;
        System.out.println("Enter Customer's Name:");
        custName = scan.nextLine();
        System.out.println("Enter Today's Date:");
        currDate = scan.nextLine();
        System.out.println("Customer Name: " + custName);
        System.out.println("Today's Date: " + currDate);
        ShoppingCart cart = new ShoppingCart(custName,currDate);
        printMenu();
        System.out.println();
        System.out.println("Choose an option:");
        userChoice = scan.next().charAt(0);

        while(userChoice != 'q'){
            if(userChoice != 'a' && userChoice != 'd' && userChoice != 'c' && userChoice != 'i' && userChoice != 'o'){
                System.out.println("Choose an option:");
                userChoice = scan.next().charAt(0);
            }
            if(userChoice == 'a' || userChoice == 'd' || userChoice == 'c' || userChoice == 'i' || userChoice == 'o'){
                executeMenu(userChoice,cart, scan);
                printMenu();
                System.out.println("Choose an option:");
                userChoice = scan.next().charAt(0);
            }

        }


    }
}
