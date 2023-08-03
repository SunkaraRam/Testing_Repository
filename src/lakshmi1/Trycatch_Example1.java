package lakshmi1;

import java.util.Scanner;

public class Trycatch_Example1 {

	public static void main(String[] args) {

		
		try {
			Scanner s=new Scanner(System.in);
			int n= s.nextInt();
			
			
			int data = 40/n;
			// may through exception
			
			System.out.println(data);
		}
		catch ( Exception e) 
		{
		System.out.println(e);	
		}
		finally {
			System.out.println("finally block is always excuted");
		}

        System.out.println("rest of the code");
	}
	
	}