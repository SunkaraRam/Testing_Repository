package lakshmi1;

public class OverLoadingDemo1 {

	public static void main(String[] args) {
   OverLoadingDemo1 od = new OverLoadingDemo1();
    od.m1();
	od.m1("ram");
	od.m1(123);
	od.m1(12.000f);
	od.m1(32.000d);
	od.m1('c');
	od.m1(true);
	
	
	}
    public void m1() {
	System.out.println("no args"); 
}
	public void m1(int i){
		System.out.println("int args");
		
	}
    
	public void m1(double d){
		System.out.println("double args");
		
	}
	
	public void m1(float f){
		System.out.println("float args");
		
	}
	
	public void m1(String s){
		System.out.println("String args");
	}	

	public void m1(char c){
		System.out.println("char args");
		
	}
	public void m1(boolean b){
		System.out.println("boolean args");
	}	

	
	
}
