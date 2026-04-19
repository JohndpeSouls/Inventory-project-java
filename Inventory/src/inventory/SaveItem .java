package inventory;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class SaveItem {

	
	public void saveData(String filePath, Product[] product, int count)
	{
		try 
		{
			FileWriter saveText = new FileWriter(filePath);
			
			for(int i = 0; i < count;i++) 
			{
				Product storage = product[i];
				
				saveText.write(storage.getProductName() + ":" + storage.getPrice() + ":" + storage.getQuantity() + "\n");
			}
			
			System.out.println("Entry Saved");
			saveText.close();
		} catch (IOException e) {
			System.out.println("Error, cannot save. File path error");
		}
		
	}
	public void loadData(String filePath, InventoryManager manager) {
        int count = 0;

    try (Scanner scanner = new Scanner(new File("src/inventory/stocks.txt"))) {

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(":");

            String productName = parts[0];
            double price = Double.parseDouble(parts[1]);
            int productQuantity = Integer.parseInt(parts[2]);
            manager.addProduct(productName,price,productQuantity);
        }
    }
 
    catch (FileNotFoundException e) {
    }

    }
	
}

/*
 *         Item[] items = {
            new Item("banana", 2, 5),
            new Item("apple", 3, 10)
        };
 * */
