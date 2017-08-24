package logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileReader {

	public Object odczyt(){
		Object obj= new Object();
		File file= new File("BeerStore.txt");
		
		try(FileInputStream fis=new FileInputStream(file);
				ObjectInputStream ois=new ObjectInputStream(fis);){
			obj=ois.readObject();
			
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	return obj;

	}
	
	
	public void zapis(Object obj){
		File file= new File("BeerStore.txt");
		try(FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream os =new ObjectOutputStream(fos);){
			
			os.writeObject(obj);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
