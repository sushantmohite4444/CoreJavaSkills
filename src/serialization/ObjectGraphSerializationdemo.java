package serialization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dogdemo implements Serializable{
	  int age =23;
	String country="paki";
}
class catdemo implements Serializable{
	dogdemo h = new dogdemo();	
}
class rat implements Serializable   {
	catdemo c = new catdemo();
}
public class ObjectGraphSerializationdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		rat r =new rat();
//		FileOutputStream file =new FileOutputStream("I:\\Myjavadirectry\\graph.sushant");
//
//		ObjectOutputStream oos =new ObjectOutputStream(file);
//
//		oos.writeObject(r);
		
		FileInputStream fis =new FileInputStream("I:\\myjavadirectry\\graph.sushant");
		ObjectInputStream ois= new ObjectInputStream(fis);
		rat r1 =new rat();
		r1=(rat)ois.readObject();
		System.out.println(r1.c.h.age +  " "+ r1.c.h.country);
	
	}
}
