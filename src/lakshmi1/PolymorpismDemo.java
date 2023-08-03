package lakshmi1;

public class PolymorpismDemo {

	public static void main(String[] args) {
		PolymorpismDemo p =  new PolymorpismDemo();
		p.m1(12 ,3 ,5);
		p.m1(23 ,56);
		p.m1(12);
		
		
	}

	
	public void m1 (int a, int b, int c) {
		
	int	d = a+b+c;
		System.out.println("Addition of 3 numbers="+d);
	}
	
	public void m1 (int a , int b) {
		int c = a*b;
		System.out.println("Multiplication of two numbers="+c);
	}
	
	public void m1 (int[]x){
		System.out.println("int method with single orgument");
		
	}
	
	public void m1 (int x) {
	System.out.println("int method with argument");	
	}
	
}
