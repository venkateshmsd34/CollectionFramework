package com.raju.listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		list.add("priya");
		list.add(10);
		list.add(200.8);
		list.add(true);
		list.add(new ArrayListDemo());
		System.out.println(list);
		System.out.println(list.size());
		System.out.println();
		
		
		//Iterator,listIterator,foreach
		
		Iterator i = list.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
		

	}

}


// // output 
// 0
// [priya, 10, 200.8, true, com.raju.listdemo.ArrayListDemo@372f7a8d]
// 5

// priya
// 10
// 200.8
// true
// com.raju.listdemo.ArrayListDemo@372f7a8d
// //


// --------------------------------------------------------------------------------------------------------------------------



// package com.raju.listdemo;

// import java.util.ArrayList;
// import java.util.Iterator;

// public class ArrayListDemo {

// 	public static void main(String[] args) {
// 		ArrayList<String> list = new ArrayList<> ();
// 		System.out.println(list.size());
// 		list.add("priya");
// 		list.add("jyo");
// 		list.add("raju");
// 		System.out.println(list);
		
// 		System.out.println();
		
// 		list.set(1,"kavitha");
// 		System.out.println(list);
// 		System.out.println(list.size());
// 		System.out.println();
		
// 		list.add(1,"pallavi");
// 		System.out.println(list);

// 		System.out.println(list.size());
// 		System.out.println();
		
// 		System.out.println(list.get(2));
// 		System.out.println();
		
// 		//Iterator,listIterator,foreach
		
// 		Iterator i = list.iterator();
// 		while(i.hasNext()) {
// 			String str = (String) i.next();
// 			System.out.println(str);
// 		}
		

// 	}

// }

// //output
// 0
// [priya, jyo, raju]

// [priya, kavitha, raju]
// 3

// [priya, pallavi, kavitha, raju]
// 4

// kavitha

// priya
// pallavi
// kavitha
// raju







// //
// package com.raju.listdemo;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Iterator;
// import java.util.ListIterator;

// public class ArrayListDemo {

// 	public static void main(String[] args) {
// 		ArrayList<String> list = new ArrayList<> ();
// 		System.out.println(list.size());
// 		list.add("priya");
// 		list.add("jyo");
// 		list.add("raju");
// 		System.out.println(list);
		
// 		System.out.println();
		
// 		list.set(1,"kavitha");
// 		System.out.println(list);
// 		System.out.println(list.size());
// 		System.out.println();
		
// 		list.add(1,"pallavi");
// 		System.out.println(list);

// 		System.out.println(list.size());
// 		System.out.println();
		
// 		System.out.println(list.get(2));
// 		System.out.println();
	
// 		System.out.println(list);
		 
// 		//Iterator,listIterator,foreach
		
// 		Iterator<String> i = list.iterator();
// 		while(i.hasNext()) {
// 			String str = i.next();
// 			System.out.println(str);
// 		}
		
// 		System.out.println();
		
// 		ListIterator<String> li = list.listIterator(list.size());
// 		while(li.hasPrevious()) {
// 			String str1 = li.previous();
// 			System.out.println(str1);
			
// 		}
// 		Collections.sort(list);
// 		System.out.println();
// 		for(String str2 : list)
// 		{
			
// 			System.out.println(str2);
// 		}
		
		

// 	}

// }
// //output
// 0
// [priya, jyo, raju]

// [priya, kavitha, raju]
// 3

// [priya, pallavi, kavitha, raju]
// 4

// kavitha

// [priya, pallavi, kavitha, raju]
// priya
// pallavi
// kavitha
// raju

// raju
// kavitha
// pallavi
// priya

// kavitha
// pallavi
// priya
// raju


