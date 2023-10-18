package collectionexamples;

import java.beans.PropertyEditorManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Mapfourexample {
	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fos=new FileOutputStream("I:\\Myjavadirectry\\abc.Properties");
		
		FileInputStream fis=new FileInputStream("I:\\Myjavadirectry\\abc.Properties");
		 Properties p =new Properties();
		 p.load(fis); // to retrieve
		 p.setProperty("username","vikas");
	String s=	 p.getProperty("password");
//	System.out.println(s);
	Enumeration n = p.propertyNames();
	while(n.hasMoreElements()) {
		System.out.println( p.getProperty((String) n.nextElement()));
	}
	
	
	FileOutputStream fos = new FileOutputStream("I:\\Myjavadirectry\\abc.Properties");
	p.store(fos, "Updated by sushant mohite for practice  "); //store 

	}
}