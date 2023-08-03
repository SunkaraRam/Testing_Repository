package lakshmi1;

import java.util.Scanner;

public class Armstrong {
    
	public static void main(String[] args) {
		System.out.println("enter number");
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int result =0,a=0;
    a=num;
    while (num>0) {
    	int reminder =num%10;
    	result =result+(int)Math.pow(reminder,3);
    num=num/10;
    
    }
    
	if (a==result) {
		System.out.println("given number is armstrong");
	}
	else {System.out.println("given number is not armstrong");
		
	}
	}

}
