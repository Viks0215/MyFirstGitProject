package com.vel.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
			
		public static void main(String[] args) {
			
			ArrayList<Integer> list1 = new ArrayList<Integer>();

			list1.add(15);
			list1.add(25);
			list1.add(35);
			
			System.out.println("Printing 0 to 15");
			for(int i=0; i<15; i++) {
				System.out.println(i);
			}

			ArrayList<Integer> list2 = new ArrayList<Integer>();

			list2.add(65);
			list2.add(65);
			list2.add(65);

			list1.addAll(list2);

			for(int x: list1){

			System.out.println(x);

				
			}
		
	}

}
