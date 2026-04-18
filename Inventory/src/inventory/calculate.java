package inventory;

public class calculate {
	
    public void lowStock(Product[] inventory,int count) {
        System.out.println("Low on Stock: ");

        for (int i = 0; i < count; i++) { 
            if (inventory[i].getQuantity() < 10) {
                System.out.print(inventory[i].getProductName() + " " + inventory[i].getQuantity() + ", ");
            }
        }
        System.out.println("");
    }
    
    
    public double totalValue(Product[] inventory,int count) {
        System.out.println("Total Value: ");
        double total = 0;

        for (int i = 0; i < count; i++) { 
            total += inventory[i].getPrice() * inventory[i].getQuantity();
        }
        return total;
    }
}
