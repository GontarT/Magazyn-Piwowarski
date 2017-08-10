package logic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveList {
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
