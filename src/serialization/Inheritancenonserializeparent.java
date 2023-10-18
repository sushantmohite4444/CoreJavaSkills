package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class dogs {
		int i=10;
		dogs(){
			
		}
		dogs(int a){
			this();
			System.out.println(a);
		}
	
	}
	class puppy extends dogs implements Serializable{
		puppy(){
			this(3);
		}
		
		puppy(int a) {
			super(a);
			// TODO Auto-generated constructor stub
		}

		int j=20 ;
	}

public class Inheritancenonserializeparent {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		puppy p =new puppy();
		p.i=01;
		p.j=02;
		FileOutputStream fos =new FileOutputStream("I:\\myjavadirectry\\sushant.parentdemo");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(p);
		
		FileInputStream fis =new FileInputStream("I:\\myjavadirectry\\sushant.parentdemo");
		ObjectInputStream ois =new ObjectInputStream(fis);
		puppy pt =(puppy)ois.readObject();
		
		System.out.println(pt.i+" "+ pt.j);
		
		
	}
}
