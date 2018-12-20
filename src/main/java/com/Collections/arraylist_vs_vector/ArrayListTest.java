package com.Collections.arraylist_vs_vector;

import java.util.ArrayList;

public class ArrayListTest implements Runnable{
	
	public static ArrayList<String> arraylist = new ArrayList<String>();

	public void run() {
		
		for (int i = 0; i < 20; i++) {

			arraylist.add("a"+i);
			arraylist.add("b"+i);
			arraylist.add("c"+i);
			
		}
		
		System.out.println("Array List is:"+arraylist);
		
	}

}
