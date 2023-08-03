package lakshmi1;

import java.util.Scanner;

public class Riverse_Number {

	public static void main(String[] args) {
   int num,reminder,result=0;
        System.out.println("enter number");
		Scanner in =new Scanner(System.in);
		num=in.nextInt();
		while(num>0){
		reminder=num%10;
		result=result*10+reminder;
		num=num/10;


	}
		System.out.println("reverse of the number"+result);

	
}
}