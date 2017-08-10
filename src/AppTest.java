import data.Malt;
import data.Store;
import logic.AddItem;
import logic.AddItemMenu;
import logic.ShowItem;

public class AppTest {

	public static void main(String[] args) {
		Store store=new Store();
		
		AddItemMenu addItemMenu=new AddItemMenu();
		AddItem add=new AddItem();
		addItemMenu.showItemMenu();
		
		
		
		
		add.addItem(store);
		
	
		//System.out.println(store.getList());
		
		
		ShowItem showItem=new ShowItem();
		showItem.showItem(store);
		
		
		
		
			
		
		
		
	}

}
