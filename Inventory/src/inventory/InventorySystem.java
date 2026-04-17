package inventory;

import java.util.Scanner;

public class InventorySystem {
    InventoryManager manager = new InventoryManager();
    Scanner scan = new Scanner(System.in);

    public void addProduct() {

        System.out.print("Please enter your product: ");
        String productName = scan.nextLine();

        System.out.print("Enter the price: ");
        double price = scan.nextDouble();

        System.out.print("Enter the quantity: ");
        int productQuantity = scan.nextInt();


        manager.addProduct(productName,price,productQuantity);
    }


    public void updateStock() {
        System.out.print("Enter Product Name: ");
        String productName = scan.nextLine();
        manager.updateStock(productName);
    }

    public void viewProducts() {
        manager.viewProducts();
    }

    }




