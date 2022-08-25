package com.yash.garbagecollection;

public class Finalizedemo {

	public static void main(String[] args) {
		System.out.println("Finalizedemo.main() starts");
		String s = new String("Dipak");

		s = null;
		System.gc();
		System.out.println("Finalizedemo.main() ends");

	}

	public void finalize() {
		System.out.println("Finalizedemo.finalize() called");
	}

}
