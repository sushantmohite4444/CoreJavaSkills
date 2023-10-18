package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sendersenddurgasstate {
	public static void main(String[] args) throws IOException {		
		DurgaUIDdemo d=new DurgaUIDdemo();
		FileOutputStream fos =new FileOutputStream("I:\\myjavadirectry\\durga.durga");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(d);
	}

}
