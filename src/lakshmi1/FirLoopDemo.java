package lakshmi1;

public class FirLoopDemo {

	public static void main(String[] args) {
   MultiDimensialDemo();
	forEachDemo1();
	forEachDemo();
	}
    public static void  MultiDimensialDemo() {
    	
    	
    	
    	String[][] student=new String[2][2];
    	student[0][0]="hyd";
    	student[0][1]="sec";
    	student[1][0]="patna";
    	student[1][1]="chennai";
    	
    	System.out.println(student[0][0]);
    }
     public static void forEachDemo1() {
    	 for (int i = 2;i<=20; i++){
    		 
    	if (i==15) {
    		
    		continue;
    		
    	}
    	System.out.println(i); 	 
    	 }
    	 
     }

    public static void forEachDemo() {
    	
    	String[]students =new String[4];
    	int[] numbers =new int[4];
    	
    	
     students [0] ="ravi";	
     students [1] ="Meghana";	
     students [2] ="Kruthika";	
     students [3] ="Ramani";	
  //   students [4] ="raju";
     for (String name : students) {
    	 
    	if(name.equalsIgnoreCase("meghana")) {
    		break;
    	}
    	
    	
    	System.out.println(name);
    	
    	}
     }
    	
    }





