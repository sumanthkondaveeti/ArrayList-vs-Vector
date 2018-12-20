package com.Collections.arraylist_vs_vector;

import java.util.Vector;

public class VectorTest implements Runnable {
	
	public static Vector<String> vector = new Vector<String>();

	public void run() {

		
		for (int i = 0; i < 20; i++) {

			vector.add("a"+i);
			vector.add("b"+i);
			vector.add("c"+i);
			
		}
		
		System.out.println("vector List is:"+vector);
		
	}

}
