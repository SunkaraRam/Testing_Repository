package lakshmi1;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.m1(new Object());//obj version
		t.m1("ramani");//string version
		t.m1(null);//string version
		
		
	}

	public void m1(String s){
		
	System.out.println("string version");
	}
		
	public void m1(Object o) {
		System.out.println("object version");
		
	}
	
}

