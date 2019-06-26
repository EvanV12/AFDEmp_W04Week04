package p07ArraylistHashMap_etc;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBunnyMain {

	public ArrayListBunnyMain() { }

	public static void main(String[] args) {
		ArrayList<J01Bunny> bunnylist = new ArrayList<>();
		System.out.println("\"bunnylist\" list size is " + bunnylist.size() + ".\n");
		for(int i = 1; i <= 15; i++) {
			bunnylist.add(new J01Bunny(i));
		}
		
		System.out.println("New \"bunnylist\" list size is " + bunnylist.size() + ".\n");
		
		for (int i = 0; i < bunnylist.size(); i++) {
			bunnylist.get(i).hop();
		}
		
		
		/*for (int i = 0; i < bunnylist.size(); i++) {
			bunnylist.get(i).equals();
		}*/
		
		
		J01Bunny b1 = new J01Bunny(1, "Bugs");
		J01Bunny b2 = new J01Bunny(2, "Daffy");
		J01Bunny b3 = new J01Bunny(3, "Bugs");
		
		
		System.out.println();
		System.out.println("Does b1 equal b2? Answer is: " +  b1.equals(b2));
		System.out.println("Does b1 equal b3? Answer is: " +  b1.equals(b3) + "\n");
		
		
		Iterator<J01Bunny> bunnyiterator = bunnylist.iterator();
		while(bunnyiterator.hasNext())
			bunnyiterator.next().hop();
	}

}

