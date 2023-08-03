package lakshmi1;

public class Test5 {

	public static void main(String[] args) {
		Test5 t = new Test5();
		Animal a = new Animal();//animal version 
		t.m1(a);
		monkey m = new monkey ();//monkey version
		t.m1(m);
		Animal a1 = new monkey();//animal version
		t.m1(m);
	}

	public void m1(Animal a) {
		System.out.println("animal version");
		
	}
	
	public void m1 (monkey m) {
		System.out.println("money version");
	}
}
