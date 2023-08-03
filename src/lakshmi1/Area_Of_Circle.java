package lakshmi1;

import java.util.Scanner;

public class Area_Of_Circle {

	public static void main(String[] args) {

		int radious;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter radious of the circle");
		
		radious=in.nextInt();
		
		double area=Math.PI*radious*radious;
		
		System.out.println("area circle is"+area);
		
		
	}

}
