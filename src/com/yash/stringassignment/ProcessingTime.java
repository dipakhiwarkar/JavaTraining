package com.yash.stringassignment;

public class ProcessingTime {

	public void BufferDemo()
	{
		StringBuffer buffer=new StringBuffer("Buffer stream");
		
	}
	
	public void BuilderDemo()
	{
		StringBuilder buffer=new StringBuilder("Builder stream");
		
	}
	public static void main(String[] args) {
		ProcessingTime p = new ProcessingTime();
		long start1 = System.nanoTime();
		p.BufferDemo();
		long end1 = System.nanoTime();
		System.out.println("Start time For buffer " + start1 + "End Time " + end1);
		
		long start2 = System.currentTimeMillis();
		p.BuilderDemo();
		long end2 = System.currentTimeMillis();
		System.out.println("Start time For Builder " + start2 + "End Time " + end2);
		
		

	}

}
