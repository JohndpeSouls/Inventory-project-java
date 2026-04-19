package inventory;
import java.util.*;

public class MainInventory {

	private static final String filePath = "src/inventory/stocks.txt"; //Universal path
	//not sure if this works on net beans. But project folder -> src -> package, inside package is this file and txt file.
	//src/inventory/stocks.txt"
	
	public static void main(String[] args) {
		InventoryManager manager = new InventoryManager();
		SaveItem save = new SaveItem();
		calculate compute = new calculate();
		Scanner scan = new Scanner(System.in);
		double total = 0;
		int exit = 1;
		
		System.out.println(" __          __  _                            _          _____           _ _             _                   _____       __     \r\n"
				+ " \\ \\        / / | |                          | |        |_   _|         | (_)           | |                 / ____|     / _|    \r\n"
				+ "  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___     | |  _ __   __| |_  ___       | | __ ___   ____ _| |     __ _| |_ ___ \r\n"
				+ "   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\    | | | '_ \\ / _` | |/ _ \\  _   | |/ _` \\ \\ / / _` | |    / _` |  _/ _ \\\r\n"
				+ "    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) |  _| |_| | | | (_| | |  __/ | |__| | (_| |\\ V / (_| | |___| (_| | ||  __/\r\n"
				+ "     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_____|_| |_|\\__,_|_|\\___|  \\____/ \\__,_| \\_/ \\__,_|\\_____\\__,_|_| \\___|\r\n"
				+ "                                                                                                                                \r\n"
				+ "                                                                                                                                ");
		
		while(exit == 1)
		{
			
			
			System.out.println("\n====== Management ======");	
			System.out.println("1. Add Product\r\n"
								+ "2. Update product details\r\n"
								+ "3. View Products\r\n"
								+ "4. Compute Total Value\r\n"
								+ "5. Check for low stocks in storage\r\n"
								+ "6. Save Report\r\n"
								+ "7. Exit\r\n"
								+ "");	
			
			System.out.print("Enter Choice: ");
			int choice = readInt(scan);
			
			
			switch(choice)
			{
				case 1:
			        System.out.print("Please enter your product: ");
			        String productName = scan.nextLine();
			        
			        System.out.print("Enter the price: ");
			        double price = readDouble(scan);
			        
			        System.out.print("Enter the quantity: ");
			        int productQuantity = readInt(scan);

			        manager.addProduct(productName,price,productQuantity);
					break;
					
				case 2:
			        System.out.print("Enter Product Name: ");
			        String productName_2 = scan.nextLine();
			        manager.updateStock(productName_2);
					break;
					
				case 3:
					manager.viewProducts();
					break;
					
				case 4:
					total = compute.totalValue(manager.getInventory(),manager.getCount());
					System.out.println("\n Total value of items " + total );
					break;
					
				case 5:
					compute.lowStock(manager.getInventory(), manager.getCount());
					break;
					
				case 6:
					save.saveData(filePath, manager.getInventory(),manager.getCount());
					break;
					
				case 7:
					System.out.println("Program Terminated");
					exit = 0;
					break;
					
				default:
					System.out.println("Invalid choice, try again \n");
			}
			
		}
		
		
		
		scan.close();

	}
	
	//thanks sir (from that one exams)
	
	private static int readInt(Scanner sc) { 
	    while (!sc.hasNextInt()) 
	    {
	        System.out.print("Invalid input. Please enter an integer: ");
	        sc.nextLine();
	    }
	    int value = sc.nextInt();
	    sc.nextLine(); 
	    return value;
	}

	private static double readDouble(Scanner sc) {
	    while (!sc.hasNextDouble()) 
	    {
	        System.out.print("Invalid input. Please enter a number: ");
	        sc.nextLine();
	    }
	    double value = sc.nextDouble();
	    sc.nextLine();
	    return value;
	}

}



