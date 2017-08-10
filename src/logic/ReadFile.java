package logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {

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
}
