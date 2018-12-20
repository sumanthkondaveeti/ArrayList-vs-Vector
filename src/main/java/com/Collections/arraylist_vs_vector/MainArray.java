package com.Collections.arraylist_vs_vector;

public class MainArray {

	public static void main(String[] args) {
		
		for (int i = 0; i<20; i++){
			Thread thread = new Thread(new ArrayListTest(), "Thread"+i);
			thread.start();
		}

	}

}
