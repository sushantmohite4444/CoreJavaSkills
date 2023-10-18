package deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
int i=10;
int j=20;
}
class Cat implements Serializable
{
int i=30;
int j=40;
}


public class ExampleDeserialization  {

	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
			Dog d1=new Dog();
			Cat c1=new Cat();
		
			FileOutputStream fos=new FileOutputStream("I:\\Myjavadirectry\\abc.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d1);
			oos.writeObject(c1);
			
			FileInputStream fis=new FileInputStream("I:\\Myjavadirectry\\abc.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Dog d2=(Dog)ois.readObject(); // order is important  or same order as writeObject() order
			Cat c2=(Cat)ois.readObject();
			
			System.out.println(d2.i+"................"+d2.j);
			System.out.println(c2.i+"................"+c2.j);


	}

}
