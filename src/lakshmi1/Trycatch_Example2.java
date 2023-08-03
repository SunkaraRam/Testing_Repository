package lakshmi1;

public class Trycatch_Example2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	int [] num = {10,20,30,40,};
        	System.out.println(num[3]);
        	} catch (ArrayIndexOutOfBoundsException e) {
        		System.out.println(e);
		}
          finally {
			System.out.println("finally block is always excuted");
		}
          
          System.out.println("rest of the code");
	}

}
