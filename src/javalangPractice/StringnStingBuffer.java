package javalangPractice;

public class StringnStingBuffer {

	public static void main(String[] args) {
		
		String s1 = new String("durga");
		String s2 = new String("durga");
		System.out.println(s1==s2);
		
		
		
		StringBuffer sb1 = new StringBuffer("durga");
		StringBuffer sb2 = new StringBuffer("durga");
		System.out.println(sb1==sb2);
		
		String ns = "durga";
		String ns1 ="durga";
		
		System.out.println("Referece pointing at same obj = " + (ns== ns1));
		

	}

}
