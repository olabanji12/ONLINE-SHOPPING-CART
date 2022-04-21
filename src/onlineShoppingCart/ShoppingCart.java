package onlineShoppingCart;

import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName;
        this.currentDate = currentDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCurrentDate() {
        return currentDate;
    }
    public void addItem(ItemToPurchase item){
      cartItems.add(item);
    }
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
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }
    public int getNumItemsInCart(){
        int total =0;
        for (ItemToPurchase Item: cartItems) {
            total += Item.getQuantity();
        }
        return total;
    }
    public int getCostOfCart(){
        int totalCost =0;
        for (ItemToPurchase Item: cartItems) {
            totalCost += Item.getPrice() * Item.getQuantity();
        }
        return totalCost;
    }
    public void printTotal(){
        if(cartItems.isEmpty()){
            System.out.println("SHOPPING CART IS EMPTY");
        }
        else{
            System.out.println(getCustomerName() +"'s" + " Shopping Cart - " + getCurrentDate());
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println();
            for (ItemToPurchase Item: cartItems) {
                System.out.println(Item.getName() + " " + Item.getQuantity() + " @ $" + Item.getPrice() + " = " + "$" + Item.getPrice() * Item.getQuantity());
            }
            System.out.println("Total: $" + getCostOfCart());
        }
    }
    public void printDescriptions(){
        System.out.println(getCustomerName() +"'s" + " Shopping Cart - " + getCurrentDate());
        System.out.println();
        System.out.println("Item Descriptions");
        for (ItemToPurchase Item: cartItems) {
            Item.printItemDescription();
        }
    }


}
