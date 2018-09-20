import java.util.ArrayList;

public class Inventory {

    public static void main(String[] args) {


        ArrayList<InventoryItem> inventory = new ArrayList<InventoryItem>();
        inventory.add(new InventoryItem("Pencil", 1111, 10, .25));
        inventory.add(new InventoryItem("Pen", 9876, 2222, .99));
        inventory.add(new InventoryItem("Canned Air", 3333, 5, 2.00));
        inventory.add(new InventoryItem("Notebook", 4444, 10, 2.50));
        inventory.add(new InventoryItem("Staples", 5555, 5, 1.00));
        inventory.add(new InventoryItem("Paper Clips", 6666, 10000, .05));



        double total = 0;

        for (int i = 0; i < inventory.size(); i++) {
            inventory.get(i).output();

        }


    }

}
