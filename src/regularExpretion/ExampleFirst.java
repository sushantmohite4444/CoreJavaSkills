package regularExpretion;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.SchemaOutputResolver;
    
//1. a to z, A to Z, 0 to 9, -,#
//2. The 1st character should be alphabet symbol only.
//3. The length of the identifier should be at least 2.

public class ExampleFirst {

	public static void main(String[] args) {
//		Pattern p= Pattern.compile("[a-zA-Z][a-zA-Z0-9-#]+");
		Pattern p= Pattern.compile("[a-zA-Z][a-zA-Z0-9-#][a-zA-Z0-9-#]*");
		System.out.println("enter valid string");
		Scanner sc =new Scanner(System.in );
		String s=sc.nextLine();
		Matcher m = p.matcher(s);
		if(m.find()&& m.group().equals(s)) {
			System.out.println("congratutaions valid input");
		}
		else {
			System.out.println("invalid input");
		}
	}

}
