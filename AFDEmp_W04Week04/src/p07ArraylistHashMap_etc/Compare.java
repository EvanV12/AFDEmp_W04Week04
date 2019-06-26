package p07ArraylistHashMap_etc;

import java.util.TreeSet;
import java.util.Iterator;


public class Compare {

	public Compare() { }

	public static void main(String[] args) {

		TreeSet<J01Bunny> set = new TreeSet<>();
		set.add(new J01Bunny("Ann", 87));
		set.add(new J01Bunny("Bob", 83));
		set.add(new J01Bunny("Cat", 99));
		Iterator<J01Bunny> itr = set.iterator();
			while (itr.hasNext()) {
				J01Bunny s = itr.next();
				System.out.println("Cowabunga " + s.getName() + " " + s.getNumber());
			}

	}
	
}




