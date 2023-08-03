package lakshmi1;

import java.util.Scanner;

public class Lakshmi2 {
	
	public static void main(String[]args) {
		
	Scanner input=new Scanner(System.in);
	System.out.println("enter the value to calculate its sum");
	int num =input.nextInt();
	
    
	int sum=0;
   while (num !=0) {
    	 
    	int lastdigits=num%10;
    	sum=sum+lastdigits;
    	num=num/10;
    	
    	 
     }
     
     System.out.println("sum of its digits"+sum);
}
}