package lakshmi1;

public class OverridingChild extends OverridingPerent {

	public  void marry() {
	System.out.println("siri");
	}
	public void add (int a ,int b) {
		int c = a*b;
		System.out.println("Multiplication of two numbers="+c);
		
	}
	
   public static void mul (int a , int b) {
	   int c = a+b;
	   System.out.println("Addition of two numbers="+c);
	}
   
   public static void main(String[] args) {
	   
	   OverridingChild ov = new OverridingChild ();
	   ov.add(34, 70);
	   OverridingPerent ovp = new OverridingPerent ();
	   ovp.add(45, 80);
	   OverridingPerent ovp1 = new OverridingChild();
	   ovp1.add(67, 90);
	   ovp1.mul(20, 20);
}
   
}
