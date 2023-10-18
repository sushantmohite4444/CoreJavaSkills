package fileiopackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFileInSpeceficDrive {
	public static void main(String[] args) throws IOException {
//		File f =new File("I:\\Myjavadirectry","mytxt.txt");
//		f.createNewFile();
//		System.out.println("file create");
		
//		File f = new File("i:\\photo");
//		String s[]= f.list();
//		for(String t:s ) {
//			System.out.println(t);
//		}
		
//		File f =new File("I:\\Myjavadirectry","mytxt.txt");
//		FileWriter fw = new FileWriter(f,true);
//		fw.write("\n sushant ");
//		fw.write("vikas ");
//		fw.write("mohite ");
//		fw.write(" i am an engineer");
//		fw.flush();
//		fw.close();
//		System.out.println("Data inserted");
		
//		File f =new File("I:\\Myjavadirectry","mytxt.txt");
//		FileReader f1 = new FileReader(f);
//		int i = f1.read();
//		System.out.println((char)i);
//		while(i != -1) {
//			System.out.println((char)i);
//			i=f1.read();
//		}
//		
//		File F1 = new File("I:\\Myjavadirectry");
//		System.out.println(F1.mkdir());
		
//		File f =new File("I:\\Myjavadirectry","mytxt.txt");
		FileReader fr =new FileReader("I:\\Myjavadirectry\\mytxt.txt");
		BufferedReader Bf = new BufferedReader(fr);
		String line =Bf.readLine();
//		System.out.println(line);
		
		 while(line!=null) {
			 System.out.println(line);
			 line=Bf.readLine();
		 }
		 
		 FileWriter fw=new FileWriter("I:\\Myjavadirectry\\cricket.txt"); 
		 PrintWriter out=new PrintWriter(fw); 
		 out.write(100); 
//		 out.println(100); 
		 out.flush(); 
		 out.close(); 
		
	}
}
