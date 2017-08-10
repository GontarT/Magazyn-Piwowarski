package logic;
import data.Accessories;
import data.Hop;
import data.Malt;
import data.Product;
import data.Store;
import data.Yeast;
import java.util.ArrayList;
import java.util.Scanner;


public class AddItem {

	public void addItem(Store store){
		Scanner sc= new Scanner(System.in);
		int number=0;
		number=sc.nextInt();
		sc.nextLine();
		System.out.println("Podaj producenta ");
		String producer=sc.nextLine();
		System.out.println("Podaj wagê produktu w kg ");
		Double weight=sc.nextDouble();
		switch(number) {
		case 1:	
			String productType="S³ód";
			Product product =new Malt(productType,producer,weight);
			store.getList().add(product);
			break;
		case 2:
			
			productType="Chmiel";
			product =new Hop(productType,producer,weight);
			store.getList().add(product);
			break;
		case 3:
			
			productType="Dro¿d¿e";
			product =new Yeast(productType,producer,weight);
			store.getList().add(product);
			break;
		case 4:
			
			productType="Dodatki";
			product =new Accessories(productType,producer,weight);
			store.getList().add(product);
			break;
		}
		
		sc.close();
		
		
		
	}
}
