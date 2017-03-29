package Collections;
import java.util.HashMap; // same as TreeMap, but Faster because it allocates heap memory at run time using hashing technique and heap memory

public class HashMaps {

	public static void main(String[] args) {
//		HashMap<Integer,String> myHM= new HashMap<>(); ....... can use generic.

		HashMap myHM= new HashMap(); 
		myHM.put(222,"manbir");
		myHM.put(99, 11);
		myHM.put(232, 44);
		
		
		
		System.out.println(myHM);

	}

}
