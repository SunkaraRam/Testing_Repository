package lakshmi1;

public class Test4 {

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.m1();//var.argmethod
		t.m1(10,20);//var.argmethod
		t.m1(10);//general method
	}
	public void m1 (int x) {
		System.out.println("general method");
		
	}
	
	public void m1 (int... x) {
		
		System.out.println("var.argmethod");
	}
	
	}


