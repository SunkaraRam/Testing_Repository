package lakshmi1;

import java.util.Scanner;

public class Avg_sum {

	public static void main(String[] args) {

		int a,b,sum;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("enter a values");
		a=in.nextInt();
		System.out.println("enter b values");
		b=in.nextInt();
		sum=a+b;
		System.out.println("sum of 2 values"+sum);
		float avg=sum/2;
		System.out.println("avg of 2 values"+avg);
		
		
		
		
	}

}
