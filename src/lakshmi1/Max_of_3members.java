
package lakshmi1;

import java.util.Scanner;

public class Max_of_3members {

	public static void main(String[] args) {

		int a, b, c;
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("enter a values");
		a = in.nextInt();
		System.out.println("enter b values");
		b = in.nextInt();
		System.out.println("enter c values");
		c = in.nextInt();
		if (a>b&&a>c)
		{
		System.out.println("a value is big");
		
		}
		else if (a<b&&b>c)
		{
		System.out.println("b value is big");	
		}
		else
		{
			System.out.println("c value is big");
			}
	}

}
