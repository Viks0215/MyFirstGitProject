package com.vel.demo;

public class Demo3 {
	
	void evenNumber() {
		System.out.println("The Even Number Of 1 to 200 ");
		for (int i = 1; i <200; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
	    }
	}
	
	void oddNumber() {
		System.out.println("The odd Number Of 1 to 200 ");
		for (int i = 1; i <200; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
	    }

	}
	
	public static void main(String[] args) {
		
		Demo3 d3 = new Demo3();
		d3.evenNumber();
		d3.oddNumber();
			
		
	}

}
