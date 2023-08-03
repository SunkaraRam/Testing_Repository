package collections_programs;

import java.util.ArrayList;

public class Arraylist_Demo {

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
		System.out.println(p1.get(4));
		System.out.println(p1);
		
		
		p1.set(0, "ramani");
		System.out.println(p1);
		int indexres = p1.indexOf(20);
		System.out.println(indexres);
		int indexlast = p1.lastIndexOf('t');
		System.out.println(indexlast);
		p1.remove(5);
		System.out.println(p1);
		p1.set(0, 20);
		System.out.println(p1);
	
		
	}

}
