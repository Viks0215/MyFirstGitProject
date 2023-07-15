package com.vel.demo;

import java.util.ArrayList;

public class Demo2 {
			
		public static void main(String[] args) {
			
			ArrayList al = new ArrayList();
			
			al.add(62);
			al.add("Pune");
			al.add("Abad");
			al.add("Pune");
			al.add(null);
			al.add(62);
			al.add(null);
			al.remove(4);
			
			System.out.println(al);
	}

}
