package setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Java");
		hashSet.add("JDBC");
		hashSet.add("Spring");
		hashSet.add("HTML");
		hashSet.add("CSS");
		hashSet.add("React");
		hashSet.add("JS");
		hashSet.add("MYSQL");
		hashSet.add(null);
		hashSet.add("Java");
		hashSet.add("100");
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext()) {
			String name = (String)it.next();
			System.out.println(name);
		}

	}

}
