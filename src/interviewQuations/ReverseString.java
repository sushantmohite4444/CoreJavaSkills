package interviewQuations;

public class ReverseString {
	public static void main(String[] args) {
		String s ="sushant vikas mohite";
		StringBuffer B= new StringBuffer(s);
		 String m="";
		for(int i=s.length()-1;i>=0;i--) {
			m= m + (s.charAt(i));
		}
		System.out.println(B.reverse());
		System.out.println(m);
	}

}
