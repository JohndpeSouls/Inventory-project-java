package inventory;
import java.io.FileWriter;
import java.io.IOException;

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
	
}

/*
 *         Item[] items = {
            new Item("banana", 2, 5),
            new Item("apple", 3, 10)
        };
 * */
