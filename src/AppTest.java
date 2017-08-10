

import java.util.ArrayList;


import data.Malt;
import data.Product;
import data.Store;
import logic.AddItem;
import logic.AddItemMenu;
import logic.ReadFile;
import logic.SaveList;
import logic.ShowItem;


public class AppTest {

	public static void main(String[] args) {
		Store store=new Store();
		SaveList saveList=new SaveList();
		ReadFile readFile=new ReadFile();
		AddItemMenu addItemMenu=new AddItemMenu();
		ShowItem showItem=new ShowItem();
		
		store.setList((ArrayList<Product>)readFile.odczyt());
		showItem.showItem(store);
		
		AddItem add=new AddItem();
		addItemMenu.showItemMenu();
		
		
		
		
		add.addItem(store);
		
	

		
		
	
		showItem.showItem(store);
		saveList.zapis(store.getList());
		
		
		
		
		
			
		
		
		
	}

}
