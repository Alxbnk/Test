public class InventoryItem {

    String ItemName;
    int ItemNumber;
    int InStock;
    double UnitPrice;
    double Value;

    public InventoryItem(String ItemName, int ItemNumber, int InStock, double UnitPrice) { //declare variables for this class
        this.ItemName = ItemName;
        this.ItemNumber = ItemNumber;
        this.InStock = InStock;
        this.UnitPrice = UnitPrice;
        this.Value = UnitPrice * InStock; //calculate value of inventory

    }

    public void output() {
        System.out.println("Item Name = " + ItemName); //print out the item name
        System.out.println("Item Number = " + ItemNumber); //print out the item number
        System.out.println("In Stock = " + InStock); //print out how many of the item are in stock
        System.out.println("Item Price = $" + UnitPrice); //print out the price per item
        System.out.println("Value of inventory = $" + Value); //calculate how much the inventory is worth for this one item

    }

}
