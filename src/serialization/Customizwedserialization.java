package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class login implements Serializable {
	String id="durga";
	transient  String pass="aishawarya";
	private void writeObject(ObjectOutputStream os) throws IOException {
//		os.defaultWriteObject();
		String pass2 = "123"+ pass;
		os.writeObject(pass2);
	}
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
//		ois.defaultReadObject();  
		String pass3= (String) ois.readObject();
		 pass = pass3.substring(3);
	}
}

public class Customizwedserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		login l=new login();
	System.out.println(l.id + " "+ l.pass);
	
	FileOutputStream fos =new FileOutputStream("I:\\myjavadirectry\\sush.sushant");
	ObjectOutputStream oos =new ObjectOutputStream(fos);
	oos.writeObject(l);
	
	FileInputStream fis =new FileInputStream("I:\\myjavadirectry\\sush.sushant");
	ObjectInputStream obji= new ObjectInputStream(fis);
	login j=  (login) obji.readObject();
	
	System.out.println(j.id +" " +  j.pass);
	}
}
