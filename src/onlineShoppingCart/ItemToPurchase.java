package onlineShoppingCart;

public class ItemToPurchase {
    // defines private variables for a generic item
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    // no-arg constructor
    public ItemToPurchase() {
        itemName = "none";
        itemDescription = "none";
        itemPrice =0;
        itemQuantity =0;
    }

    // parameterized constructor
    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    // getters and setters for all the variables
    public String getName() {
        return itemName;
    }

    public void setName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public void printItemCost(){
        System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = " + (getQuantity() * getPrice()));
    }

    // prints the name and description of an item
    public void printItemDescription(){
        System.out.println(getName() +": " + getDescription());
    }
}
