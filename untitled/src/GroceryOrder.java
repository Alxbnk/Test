import java.util.ArrayList;

public class GroceryOrder {

    public static void main(String[] args) {

        ArrayList<GroceryList> inventory = new ArrayList<GroceryList>();
        inventory.add(new GroceryList("Banana", 5, 10));
        inventory.add(new GroceryList("Apple", 2, 20));
        inventory.add(new GroceryList("Orange", 6, 30));
        inventory.add(new GroceryList("Strawberry", 1, 40));
        inventory.add(new GroceryList("Pear", 3, 50));
        inventory.add(new GroceryList("Peach", 8, 60));

        double total = 0;

        for (int i = 0; i < inventory.size(); i++) {
            inventory.get(i).output();


        }


    }

}
