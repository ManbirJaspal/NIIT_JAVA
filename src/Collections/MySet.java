package Collections;
import java.util.HashSet;


public class MySet {

	public static void main(String[] args) {
		
		HashSet myhs= new HashSet(); //doesnt save multiple values.
		myhs.add(12);
		
		myhs.add(13);
		myhs.add(12);
		myhs.remove(13);
System.out.println(myhs);
		

	}

}
