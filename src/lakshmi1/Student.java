package lakshmi1;

public class Student {
	//private member of the class

	private static int rollNo=5;

		//private member of the class
	private static void showRollNo() {
		//rollNo which a private data members is
		//accessible in that class.
		System.out.println("rollNo= "+rollNo);
		
	}
public static void mains(String[]args) {
	showRollNo();
	
}
	int  mobileNumber =9829483;
	void  showMobile() {
		System.out.println("your mobile number is:"+mobileNumber);
	}
	protected String name="ramani";
	protected void showName() {
		System.out.println(name);
	}
}
