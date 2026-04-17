package inventory;

import java.util.Scanner;

public class InventoryManager {


    Scanner console = new Scanner(System.in);

    public void addProduct() {

        System.out.println("Please enter your product:");
        String productName = console.next();

        System.out.println("Enter the price");
        double price = console.nextDouble();

        System.out.println("Enter the quantity");
        int productQuantity = console.nextInt();

    }

    public void updateStock() {

        System.out.println("Please enter your product:");
        String productName = console.next();

        System.out.println("Enter the price");
        double price = console.nextDouble();

        System.out.println("Enter the quantity");
        int productQuantity = console.nextInt();

    }

    public void viewStock() {
        System.out.println("Please enter your product:");
        String productName = console.next();

        System.out.println("Enter the price");
        double price = console.nextDouble();

        System.out.println("Enter the quantity");
        int productQuantity = console.nextInt();


    }
}
