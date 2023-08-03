package lakshmi1;

public class MathDemo {

	public static void main(String[] args) {
		
		System.out.println(Math.max(40,30));
		System.out.println(Math.min(20,40));
		System.out.println(Math.sqrt(100));
		System.out.println(Math.abs(-43434));
		System.out.println(Math.pow(2, 2));
		double d =Math.random()*100;
		System.out.println("before convert to int"+d);
		int f =(int) d;
		System.out.println("After convert to int"+f);

	}

}
