package test;

import first.pack.Classconcept;
class two {
	void main1() {
		System.out.println("from child");
	}
}
class one extends two {
	void main() {
		super.main1();
		System.out.println("Main");
	}
	void ok() {
	this.main();
		System.out.println("ok");
	}
}

public class Test1 {
	public static void main(String[] args) {
		
		Classconcept c =new Classconcept();
		one t =new one();
		t.ok();
		
	}

}
