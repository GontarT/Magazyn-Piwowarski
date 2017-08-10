package logic;
import data.Product;
import data.Store;

public class ShowItem {
	
	public void showItem(Store store){
		
		for(Product x:store.getList())
			System.out.println(x);
	}

}
