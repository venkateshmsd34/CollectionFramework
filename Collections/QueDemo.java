package com.raju.listdemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Raju");
		queue.offer("pallavi");
		queue.offer("priya");

	
			for(String name : queue) {
				System.out.println(name);
			}
			System.out.println();
			System.out.println();
			Iterator<String> i = queue.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
	}
	
}

//output
Raju
pallavi
priya


Raju
pallavi
priya