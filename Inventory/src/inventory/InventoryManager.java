package inventory;

import java.util.Scanner;

public class InventoryManager {

    Scanner console = new Scanner(System.in);
    private Product[] inventory = new Product[100]; //100 items with 3 columns (name, price, quantity)
    private int count = 0;

    public void addProduct(String name, double price, int quantity){
        Product product = new Product(name,price,quantity);
        inventory[count] = product;
        count++;
    }
    
    
    public Product[] getInventory() {
        return inventory;
    }

    public int getCount() {
        return count;
    }

    public void updateStock(String name){
        for (int i = 0; i < count; i++) {
            if (name.equals(inventory[i].getProductName())) {
                System.out.print("Enter new price: ");
                double price = console.nextInt();
                System.out.print("Enter new quantity: ");
                int quantity = console.nextInt();

                inventory[i].setPrice(price);
                inventory[i].setQuantity(quantity);
            }
        }
        System.out.println("\n");
    }

    public void viewProducts(){
        System.out.println("\n====Current Inventory====");
        System.out.printf("Name               Price      Quantity\n", 0);

        for (int i = 0; i < count; i++) {
            String productName = inventory[i].getProductName();
            double price = inventory[i].getPrice();
            int quantity = inventory[i].getQuantity();
            System.out.printf("%-15s %10.2f %10d\n", productName, price, quantity);
        }
        System.out.println("\n");
    }

    

    


}
