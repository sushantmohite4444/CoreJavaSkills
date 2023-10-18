package serialization;

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

public class Dontknoworderofserializaton {

	
	public static void main(String[] args) throws IOException{

//		Dog d1=new Dog();
//		Cat c1=new Cat();
//	
//		FileOutputStream fos=new FileOutputStream("I:\\Myjavadirectry\\abc.str");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		oos.writeObject(d1);
//		oos.writeObject(c1);
		
		
		FileInputStream fis=new FileInputStream("I:\\Myjavadirectry\\abc.str");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		boolean outfromloop = true;
		Cat c2=null;
		Object o=1;
		
			try {
				while(outfromloop) {
				o= ois.readObject();
				 if(o instanceof Cat) {
					c2= (Cat)o;
				 }
				 }
			} catch (ClassNotFoundException | IOException e) {
				
				outfromloop=false;
			}
			 
				 System.out.println(c2.i +" " + c2.j);
					}
		}



