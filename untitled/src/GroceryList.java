import java.util.ArrayList;

public class GroceryList {

    private String ItemName;
    private double UnitPrice;
    private int Quantity;
    private double Price;

    public GroceryList(String itemName, double unitPrice, int quantity) {
        ItemName = itemName;
        UnitPrice = unitPrice;
        Quantity = quantity;
        this.Price = unitPrice * quantity;
    }

    public void output() {
        System.out.println("Item Name = " + ItemName);
        System.out.println("Item Price = $" + UnitPrice);
        System.out.println("Value of inventory = $" + Price);

    }


}