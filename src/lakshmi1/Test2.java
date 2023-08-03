package lakshmi1;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2 ();
		t.m1("ramani");
		t.m1("ramani");
		//t.m1(null);//reference to m1()is ambiguous problem
	}
    public void m1(String s) {
    	System.out.println("string version");
    }
	
	public void m1(StringBuffer sb) {
		System.out.println("string buffer version");
		
		
	}
}
