package onlineShoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    // defined private variables
    private String customerName;
    private String currentDate;

    // defines an arraylist used to store items
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    // no-arg constructor
    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    // Parameterized constructor
    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    //getter methods for customer name and date
    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    // adds item to user's cart
    public void addItem(ItemToPurchase item){
        cartItems.add(item);
    }

    // allows user to remove item from cart
    public void removeItem(String itemName){
        boolean contains = false;
        for (ItemToPurchase item: cartItems) {
            if (item.getName().equals(itemName)) {
                cartItems.remove(item);
                contains = true;
                break;
            }
        }
        if(!contains)
            System.out.println("Item not found in cart. Nothing removed.");
    }

    // allows users to modify the quantity of items in the cart
    public void modifyItem(ItemToPurchase item){
        boolean contains = false;
        for (ItemToPurchase Item : cartItems) {
            if (Item.getName().equals(item.getName())) {
                contains = true;
                if (Item.getQuantity() != 0){
                    Item.setQuantity(item.getQuantity());
                }
                // find the object in the list and replace it if the valu is deafult
            }
        }
        if(!contains){
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    // returns the number of items in a cart
    public int getNumItemsInCart(){
        int total =0;
        for (ItemToPurchase Item: cartItems) {
            total += Item.getQuantity();
        }
        return total;
    }

    // returns total cost of all items in the cart
    public int getCostOfCart(){
        int totalCost =0;
        for (ItemToPurchase Item: cartItems) {
            totalCost += Item.getPrice() * Item.getQuantity();
        }
        return totalCost;
    }
    public void printTotal(){
        if(cartItems.isEmpty()){
            System.out.println("OUTPUT SHOPPING CART");
            System.out.println(getCustomerName() +"'s" + " Shopping Cart - " + getDate());
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println();
            System.out.println("SHOPPING CART IS EMPTY");
            System.out.println();
            System.out.println("Total: $" + getCostOfCart());

        }
        else{
            System.out.println("OUTPUT SHOPPING CART");
            System.out.println(getCustomerName() +"'s" + " Shopping Cart - " + getDate());
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println();
            for (ItemToPurchase Item: cartItems) {
                System.out.println(Item.getName() + " " + Item.getQuantity() + " @ $" + Item.getPrice() + " = " + "$" + Item.getPrice() * Item.getQuantity());
            }
            System.out.println();
            System.out.println("Total: $" + getCostOfCart());
        }
    }
    public void printDescriptions(){
        System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
        System.out.println(getCustomerName() +"'s" + " Shopping Cart - " + getDate());
        System.out.println();
        System.out.println("Item Descriptions");
        for (ItemToPurchase Item: cartItems) {
            Item.printItemDescription();
        }
    }


}
