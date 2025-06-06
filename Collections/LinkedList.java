package com.raju.listdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("kdnm");
		list.add(1,"kevin");
		list.addFirst("raju");
		list.addLast("pallavi");
		System.out.println(list);
		
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
//output
[raju, kdnm, kevin, pallavi]
raju
kdnm
kevin
pallavi
