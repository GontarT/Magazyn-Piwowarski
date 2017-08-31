

import java.util.ArrayList;
import java.util.Scanner;
import data.Product;
import data.Store;
import logic.Menu;
import logic.FileReader;
import logic.Item;




public class AppTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Store store=new Store();
		FileReader fileReader=new FileReader();
		Scanner sc=new Scanner(System.in);
		Item item=new Item();
		Menu menu=new Menu();
		int option=0;
		store.setList((ArrayList<Product>)fileReader.odczyt());
		



			do{
			menu.showMenu();
			option=sc.nextInt();
			switch(option){
			case 1:
				menu.showItemMenu();
				item.addItem(store);
				break;
			case 2:
				item.removeItem(store);
				break;
			case 3:
				item.showItem(store);
				break;
			case 4:
				fileReader.zapis(store.getList());
				break;

			}
			}while(option!=4);































		sc.close();
	}


}
