public class GroceryList {

    private String ItemName;
    private double UnitPrice;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public GroceryList() {
    }

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
