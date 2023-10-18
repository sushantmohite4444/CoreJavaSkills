package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class man  implements Serializable{
	String name ;
	 int age;
	 man(){
		name= "sushant";
		age=12;
	}
}
class Exampleserialization {
	public static void main(String[] args) throws IOException {
		man m = new man();
		FileOutputStream fs = new FileOutputStream("I:\\Myjavadirectry\\str.sms");
		ObjectOutputStream os= new ObjectOutputStream(fs);
		os.writeObject(m);
	}
}
