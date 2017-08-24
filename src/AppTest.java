
import data.Store;
import logic.Menu;
import logic.FileReader;
import logic.Item;




public class AppTest {

	public static void main(String[] args) {
		Store store=new Store();
		FileReader fileReader=new FileReader();
		Item item=new Item();
		Menu menu=new Menu();
		
		menu.showMenu();
		
	
		
		menu.showItemMenu();
		
		
		
		
	item.addItem(store);
		
	

		
		
	
		item.showItem(store);
		fileReader.zapis(store.getList());
		
		
		
		
		
			
		
		
		
	}

}
