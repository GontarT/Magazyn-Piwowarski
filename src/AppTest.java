
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

import data.Store;
import logic.Menu;
import logic.FileReader;
import logic.Item;




public class AppTest {

	public static void main(String[] args) {
		Store store=new Store();
		FileReader fileReader=new FileReader();
		Scanner sc=new Scanner(System.in);
		Item item=new Item();
		Menu menu=new Menu();
		int option=1;




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
