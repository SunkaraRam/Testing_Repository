package collections_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo {

	public static void main(String[] args) {

		ArrayList p1 = new ArrayList ();
		
		p1.add("kousalya");
		p1.add(20);
		p1.add(78954.0f);
		p1.add(5674.000d);
		p1.add(false);
		p1.add('t');
		p1.add(20);
		p1.add(false);
		Iterator itr = p1.iterator();
		while (itr.hasNext()) {
			Object obj =  itr.next();
			System.out.println(obj);
			if (obj.equals(20)) {
				itr.remove();
				
			}
			
		}

		System.out.println(p1);
		
	}

}
