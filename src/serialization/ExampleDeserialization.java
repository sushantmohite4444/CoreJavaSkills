package serialization;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExampleDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis= new FileInputStream("I:\\Myjavadirectry\\str.sms");
		ObjectInputStream ois =new ObjectInputStream(fis);
		man m;
		m=(man)ois.readObject();
		System.out.println(m.age +" "+ m.name );
		
	}
}
