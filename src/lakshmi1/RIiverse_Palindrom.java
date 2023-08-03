package lakshmi1;

import java.util.Scanner;

public class RIiverse_Palindrom {

	public static void main(String[] args) {
		
	int num,result=0;
	int a;
	Scanner in=new Scanner(System.in);
	System.out.println("enter number");
	
	num=in.nextInt();
	a=num;
	while (num>0) {
	int reminder=num%10;
	result=result*10+reminder;
	num=num/10;
	
		
	}
	if(a==result) {
		System.out.println("given number is palindrom");
	}
	else{
		System.out.println("given number is not palindrom");
	}
	}

}
