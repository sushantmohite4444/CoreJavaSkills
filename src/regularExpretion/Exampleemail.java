package regularExpretion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//johndoe@domainsample.com
//john.doe@domainsample.net
//john.doe43@domainsample.co.uk

public class Exampleemail {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-zA-Z]"
				+ "[a-zA-Z0-9-.]*@[a-zA-Z0-9-.]+"
				+ "([.][a-zA-Z0-9]+)+");
	System.out.println("Enter your email");
		
		Scanner sc =new Scanner(System.in);
		String i= sc.nextLine();
		Matcher m= p.matcher(i);
		if(m.find()&&m.group().equals(i))
		{
		System.out.println("valid mail id");
		}
		else
		{
		System.out.println("invalid mail id");
		}
	}

}
