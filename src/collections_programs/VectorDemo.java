package collections_programs;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
       Vector Vc = new Vector ();
		
		Vc.addElement (10);
		
		Vc.addElement(null);
		
		Vc.addElement(234.00f);
		
		Vc.addElement('c');
		
		Vc.addElement(true);
		
		Vc.addElement(60);

		Vc.addElement("lakshmi");
		
		System.out.println(Vc);
		
		Vc.removeElement(60);
		
		System.out.println(Vc);
		
		Vc.removeElementAt(2);
		
		System.out.println(Vc);
		
		Object res =Vc.firstElement();
		
		System.out.println(res);
		
		res = Vc.lastElement();
		
		System.out.println(res);
		
		int length= Vc.size();
		
		System.out.println(length);
		
		res = Vc.elementAt(2);
				
		System.out.println(res);
		
		int capacity =Vc.capacity();
		
		System.out.println();
		
	



	}

}
