package lakshmi1;

import java.util.Scanner;

public class Sum_0f_its_Digits {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value to calulate its sum ");
		int num =input.nextInt();
		
		int Sum=0;
		while(num !=0){
			
		int lastdigits=num%10;
		Sum=Sum+lastdigits;
		num=num	/10;
			
		}
		System.out.println("sum of its digits"+Sum);
		
	}

}
