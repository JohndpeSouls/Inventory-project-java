package inventory;


import java.util.Scanner;

public class InventorySystem {

    Scanner console = new Scanner(System.in);

    public void addProduct(){

        Product[] products = new Product[100];

        System.out.println("Please enter your product:");
        String productName = console.next();

        System.out.println("Enter the price");
        double price = console.nextDouble();

        System.out.println("Enter the quantity");
        int productQuantity = console.nextInt();

    }

    public void updateStock(){

        Product[] products = new Product[100];

        System.out.println("Please enter your product:");
        String productName = console.next();

        System.out.println("Enter the price");
        double price = console.nextDouble();

        System.out.println("Enter the quantity");
        int productQuantity = console.nextInt();

    }

    public void viewStock(){

        Product[] products = new Product[100];

        System.out.println("Please enter your product:");
        String productName = console.next();

        System.out.println("Enter the price");
        double price = console.nextDouble();

        System.out.println("Enter the quantity");
        int productQuantity = console.nextInt();

    }
}
