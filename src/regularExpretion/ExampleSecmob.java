package regularExpretion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Write a regular expression to represent all mobile numbers.


public class ExampleSecmob {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("[7-9]+[0-9]{9}");
//		Pattern p = Pattern.compile("(0?[7-9]+[0-9]{9})");
		Pattern p = Pattern.compile("(91)?[7-9]+[0-9]{9}");
		System.out.println("Enter your mobile number start form 7-8-9");
		
		Scanner sc =new Scanner(System.in);
		String i= sc.nextLine();
		Matcher m= p.matcher(i);
		if(m.find()&&m.group().equals(i)){
			System.out.println("Currect mobile number");
		}
		else {
			System.out.println("Enter currect number");
		}
	}
}
