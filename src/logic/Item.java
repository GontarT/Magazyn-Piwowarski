package logic;

import java.util.InputMismatchException;
import java.util.Scanner;

import data.Accessories;
import data.Hop;
import data.Malt;
import data.Product;
import data.Store;
import data.Yeast;

public class Item {

	Scanner sc = new Scanner(System.in);

	public void addItem(Store store){

		int number=0;
		try{number=sc.nextInt();
		}catch(InputMismatchException e){
			System.out.println("Poda�e� nieprawid�owe dane wej�ciowe !!!");
			
		}
		sc.nextLine();
	
		
		switch(number) {
		case 1:
			try{
			System.out.println("Podaj producenta ");
			String producer=sc.nextLine();
			System.out.println("Podaj wag� produktu w kg ");
			Double weight=sc.nextDouble();
			store.getList().add(new Malt("S��d",producer,weight));
			}catch (InputMismatchException e) {
			System.out.println("Poda�e� nieprawid�owe dane wej�ciowe !!! \n");	
			}
			
			break;
		case 2:
		try{
			System.out.println("Podaj producenta ");
			String producer=sc.nextLine();
			System.out.println("Podaj wag� produktu w kg ");
			Double weight=sc.nextDouble();
			store.getList().add(new Hop("Chmiel",producer,weight));
		}catch(InputMismatchException e){
			System.out.println("Poda�e� nieprawid�owe dane wej�ciowe !!! \n");
		}
			break;
		case 3:
		try{
			System.out.println("Podaj producenta ");
			String producer=sc.nextLine();
			System.out.println("Podaj wag� produktu w kg ");
			Double weight=sc.nextDouble();	
			store.getList().add(new Yeast("Dro�d�e",producer,weight));
		}catch (InputMismatchException e) {
			System.out.println("Poda�e� nieprawid�owe dane wej�ciowe !!! \n");
		}
			break;
		case 4:
	try{
			System.out.println("Podaj producenta ");
			String producer=sc.nextLine();
			System.out.println("Podaj wag� produktu w kg ");
			Double weight=sc.nextDouble();
			store.getList().add(new Accessories("Dodatki",producer,weight));
	}catch(InputMismatchException e){
			System.out.println("Poda�e� nieprawid�owe dane wej�ciowe !!! \n");
	}
			break;
		}
	
		

		



	}

	public void showItem(Store store) {

		for (Product x : store.getList())
			System.out.println(x + "\n");
	}

	public void removeItem(Store store) {
		System.out.println("podaj kt�ry produkt usun�c ? ");
		int index = sc.nextInt();
		store.getList().remove(index - 1);

	}

}
