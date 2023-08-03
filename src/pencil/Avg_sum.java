package pencil;

import java.util.Scanner;

public class Avg_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a,b,sum;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("enter a values");
		a=in.nextInt();//10
		System.out.println("enter b values");
		b=in.nextInt();//5
		sum=a+b;//15
		System.out.println("sum of 2 values"+sum);//15
		float avg=sum/2;
		System.out.println("avg of 2 values"+avg);//7.0
	}
			
}	



