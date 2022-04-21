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

    public static void executeMenu(char choice, ShoppingCart newCart, Scanner scanChoice) {

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

            }

        }


    }
}
