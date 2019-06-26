package p07ArraylistHashMap_etc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapsBunnyMain {

	public MapsBunnyMain() { }

	public static void main(String[] args) {
		
		HashMap<String,Integer>bunnies = new HashMap<>();
		bunnies.put("Bugs", 24);
		bunnies.put("Bags", 25);
		
		if (bunnies.containsKey("Bugs")) {
			System.out.println("Indeed");	
		}
		
		if (bunnies.containsValue(24)) {
			System.out.println("Indeedio");
		}
		
		
		J01Bunny b5 = new J01Bunny(34, "Joe");
		HashSet<J01Bunny> h = new HashSet<>();
		h.add(b5);
		System.out.println(h.contains(b5));
		
		J01Bunny b6 = new J01Bunny(56, "Bolg");
		System.out.println(h.contains(b6));
		
		h.add(b6);
		System.out.println(b6.getName() + ". How about now? " + h.contains(b6));
		
		for (String bunnyname : bunnies.keySet()) {
			int bunnyage = bunnies.get(bunnyname);
			System.out.println(bunnyname + " --> " + bunnyage);
		}
		
		
		
	}

}
