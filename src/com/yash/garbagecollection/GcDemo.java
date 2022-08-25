package com.yash.garbagecollection;

public class GcDemo {

	public static void main(String[] args) {
		Integer i = new Integer(4);
		System.out.println(i);
		i = null;
		System.out.println("printing the i value:" + i);
	}

}
