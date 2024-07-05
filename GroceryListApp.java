import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroceryListApp {
    private List<String> groceryList;

    // Constructor
    public GroceryListApp() {
        groceryList = new ArrayList<>();
    }

    // Adds an item to the grocery list
    public void addItem(String item) {
        groceryList.add(item);
        System.out.println(item + " has been added to your grocery list.");
    }

    // Removes an item from the grocery list
    public void removeItem(String item) {
        if (groceryList.remove(item)) {
            System.out.println(item + " has been removed from your grocery list.");
        } else {
            System.out.println(item + " is not in your grocery list.");
        }
    }

    // Displays all items in the grocery list
    public void displayItems() {
        System.out.println("Your grocery list contains:");
        for (String item : groceryList) {
            System.out.println("- " + item);
        }
    }

    public static void main(String[] args) {
        GroceryListApp app = new GroceryListApp();
        Scanner scanner = new Scanner(System.in);

        // Adding items
        System.out.println("Enter three items to add to your grocery list:");
        for (int i = 0; i < 3; i++) {

            String item = scanner.nextLine();
            app.addItem(item);
        }

        // Display items
        app.displayItems();

        // Removing an item
        System.out.print("Enter an item to remove from your grocery list: ");
        String itemToRemove = scanner.nextLine();
        app.removeItem(itemToRemove);

        // Display items again
        app.displayItems();

        scanner.close();
    }
}
