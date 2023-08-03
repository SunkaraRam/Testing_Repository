package lakshmi1;

public class OverLoadingDemo2 {

	public static void main(String[] args) {
		
		OverLoadingDemo2 od = new OverLoadingDemo2();
		
		
	//	od.m1(false);
		od.m1(0);
        od.m1(12.00f);
    //    od.m1(123.00d);
    //    od.m1("siri");
        od.m1('n');
        
	}
 //  public void m1 (int i) {
	//   System.out.println("int args");
   //}
	
  //public void m1 (double d) {
	//   System.out.println("double args");
   //}
   
   public void m1 (float f) {
	   System.out.println("float args");
   }

  // public void m1 (String s) {
	//   System.out.println("String args");
   //}

  // public void m1 (boolean b) {
	//   System.out.println("boolean args");
 //  }

   public void m1 (char c) {
	   System.out.println("char args");
   }

   
}
