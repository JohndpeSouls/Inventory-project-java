package inventory;

import java.util.Scanner;

public class InventorySystem {

    InventoryManager manager = new InventoryManager();
    Scanner scan = new Scanner(System.in);

    public void addProduct() {

        System.out.print("Please enter your product: ");
        String productName = scan.nextLine().trim();

        // 🔒 check duplicate
        Product[] items = manager.getInventory();
        int count = manager.getCount();

        for (int i = 0; i < count; i++) {
            if (items[i].getProductName().equalsIgnoreCase(productName)) {
                System.out.println("Product already exists. Try again.");
                return;
            }
        }

        double price;
        while (true) {
            System.out.print("Enter the price (per item): ");
            if (scan.hasNextDouble()) {
                price = scan.nextDouble();
                scan.nextLine();
                if (price >= 0) break;
            } else {
                scan.nextLine();
            }
            System.out.println("Invalid price. Try again.");
        }

        int quantity;
        while (true) {
            System.out.print("Enter the quantity: ");
            if (scan.hasNextInt()) {
                quantity = scan.nextInt();
                scan.nextLine();
                if (quantity >= 0) break;
            } else {
                scan.nextLine();
            }
            System.out.println("Invalid quantity. Try again.");
        }

        manager.addProduct(productName, price, quantity);
        System.out.println("Product added successfully.");
    }

    public void updateStock() {

        Product[] items = manager.getInventory();
        int count = manager.getCount();

        if (count == 0) {
            System.out.println("No products available.");
            return;
        }

        // show list
        System.out.println("\n==== Current Inventory ====");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }

        int choice;
        while (true) {
            System.out.print("Enter product number to update: ");
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
                scan.nextLine();
                if (choice >= 1 && choice <= count) break;
            } else {
                scan.nextLine();
            }
            System.out.println("Invalid selection.");
        }

        Product selected = items[choice - 1];

        // update name (optional)
        System.out.print("Enter new name (leave blank to keep): ");
        String newName = scan.nextLine();
        if (!newName.trim().isEmpty()) {
            selected.setProductName(newName);
        }

        // update price (optional)
        System.out.print("Enter new price (or -1 to keep): ");
        if (scan.hasNextDouble()) {
            double newPrice = scan.nextDouble();
            if (newPrice >= 0) {
                selected.setPrice(newPrice);
            }
        }
        scan.nextLine();

        // update quantity (optional)
        System.out.print("Enter new quantity (or -1 to keep): ");
        if (scan.hasNextInt()) {
            int newQty = scan.nextInt();
            if (newQty >= 0) {
                selected.setQuantity(newQty);
            }
        }
        scan.nextLine();

        System.out.println("Product updated successfully.");
    }

    public void viewProducts() {
        Product[] items = manager.getInventory();
        int count = manager.getCount();

        if (count == 0) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\n==== Current Inventory ====");
        System.out.printf("No.  Name               Price      Quantity\n");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-4d %s\n", i + 1, items[i].toString());
        }

        System.out.println();
    }
}