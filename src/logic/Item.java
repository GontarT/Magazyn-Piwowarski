package logic;
import data.Accessories;
import data.Hop;
import data.Malt;
import data.Product;
import data.Store;
import data.Yeast;
import java.util.ArrayList;
import java.util.Scanner;


public class Item {


	Scanner sc= new Scanner(System.in);

	public void addItem(Store store){

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
			store.getList().add(new Malt(productType,producer,weight));
			break;
		case 2:

			productType="Chmiel";
			store.getList().add(new Hop(productType,producer,weight));
			break;
		case 3:

			productType="Dro¿d¿e";
			store.getList().add(new Yeast(productType,producer,weight));
			break;
		case 4:

			productType="Dodatki";
			store.getList().add(new Accessories(productType,producer,weight));
			break;
		}
		

		



	}


	public void showItem(Store store){

		for(Product x:store.getList())
			System.out.println(x);
	}

	public void removeItem(Store store){
		System.out.println("podaj który produkt usun¹c ? ");
		int index=sc.nextInt();
		store.getList().remove(index-1);

	}
	
}

