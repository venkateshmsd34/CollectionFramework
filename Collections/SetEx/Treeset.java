package setdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Java");
		tree.add("JDBC");
		tree.add("Spring");
		tree.add("HTML");
		tree.add("CSS");
		tree.add("React");
		tree.add("JS");
		tree.add("MYSQL");
//		tree.add(null);
		tree.add("Java");
		tree.add("100");
		System.out.println(tree);
		
		Iterator<String> it = tree.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}

	}

}
