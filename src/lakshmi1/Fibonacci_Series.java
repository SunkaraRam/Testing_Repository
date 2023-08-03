package lakshmi1;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int n =scn.nextInt();
		
		int f1,f2=0,f3=1;
		
		for(int i=0;i<n;i++);
		{
		System.out.println(f3+" ");
		
		f1=f2;
		f2=f3;
		f3=f1+f2;
		}
	}

}
