package lakshmi1;

import java.util.Scanner;

public class Factorial {
   
   
   public static void main(String[] args) {
	   System.out.println("enter number");
		int num; 
		int result=1;
		Scanner in =new Scanner(System.in);
		num=in.nextInt();
		while(num>0) {
			result=result*num;
			num--;		
		}
		
		System.out.println("factorial of the given number is="+result);

}

}
