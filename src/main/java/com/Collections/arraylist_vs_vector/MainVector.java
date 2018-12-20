package com.Collections.arraylist_vs_vector;


/**
 * Hello world!
 *
 */	
public class MainVector 
{
    public static void main( String[] args )
    {
    	for (int i = 0; i<20; i++){
			Thread thread = new Thread(new VectorTest(), "Thread"+i);
			thread.start();
		}
    	
    }
}
