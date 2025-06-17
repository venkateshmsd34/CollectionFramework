package setdemo;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkHash {

	public static void main(String[] args) {
		LinkedHashSet<String> link = new LinkedHashSet<>();
		link.add("Java");
		link.add("JDBC");
		link.add("Spring");
		link.add("HTML");
		link.add("CSS");
		link.add("React");
		link.add("JS");
		link.add("MYSQL");
		link.add(null);
		link.add("Java");
		link.add("100");
		System.out.println(link);
		
		Iterator<String> it = link.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
	}

}
