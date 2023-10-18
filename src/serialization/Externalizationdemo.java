package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class expdemo implements Externalizable{
	
	String name;
	int age;
	
	public expdemo() {
		// TODO Auto-generated constructor stub
	}
	public expdemo(String s , int i) { 	 
		this. name=s;
		this.age =i;
	
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	out.writeObject(name);
	out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String)in.readObject();
		age = in.readInt();
		
	}
		
	}
public class Externalizationdemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		expdemo p =new expdemo("sushant",22);
//		FileOutputStream fos =new FileOutputStream("I:\\myjavadirectry\\sushant.exedemo");
//		ObjectOutputStream oos =new ObjectOutputStream(fos);
//		oos.writeObject(p);
	
		FileInputStream fis =new FileInputStream("I:\\myjavadirectry\\sushant.exedemo");
		ObjectInputStream ois =new ObjectInputStream(fis);
		expdemo pt =(expdemo )ois.readObject();
		
		System.out.println(pt.name+" "+ pt.age);
 }
}
