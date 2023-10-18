package deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serialization.DurgaUIDdemo;

public class Receiverreceivedurgastaresfromsenderfromserializarionpackage {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	DurgaUIDdemo d1 ;
	FileInputStream fis =new FileInputStream("I:\\myjavadirectry\\durga.durga");
	ObjectInputStream ois =new ObjectInputStream (fis);
	d1=(DurgaUIDdemo)ois.readObject();
	System.out.println(d1.age +" "+ d1.name);
	}
}
