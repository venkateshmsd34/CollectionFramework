package com.raju.listdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("kdnm");
//		list.add(1,"kevin");
//		list.addFirst("raju");
//		list.addLast("pallavi");
//		System.out.println(list);
//		
//		
//		Iterator i = list.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		list.offerFirst("Priya");
		System.out.println(list);               //[Priya, kdnm]

		System.out.println(list.poll());        //Priya

		System.out.println(list);               //[kdnm]

		System.out.println(list.remove());      //kdnm

		System.out.println(list);               //[]

		System.out.println(list.peek());        //null

		System.out.println(list);               //[]

		System.out.println(list.element());     //Exception in thread "main" java.util.NoSuchElementException
                                                //     at java.base/java.util.LinkedList.getFirst(LinkedList.java:255)
                                                //     at java.base/java.util.LinkedList.element(LinkedList.java:674)
                                                //     at com.raju.listdemo.LinkedListDemo.main(LinkedListDemo.java:29)
		System.out.println(list);
		
		 

	}

}
