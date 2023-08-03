package lakshmi1;

public class Test3 {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.m1(10, 10f);
		t.m1(10f, 10);
		//t.m1(10, 10);//reference to m1 is ambiguous
		//t.m1(10.5f, 10.5f);//symbol:m1 method is (float,float) 
		
	}
		public void m1(int i,float f) {
		System.out.println("int float varsion");	
			
		}
		
		public void m1(float f ,int i) {
			System.out.println("float int version");
		}
		
	}


