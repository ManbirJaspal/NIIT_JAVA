package Collections;
import java.util.ArrayList;



public class arraylist {

	public static void main(String[] args) {
	 ArrayList mylist = new ArrayList();
	 ArrayList mylist2 = new ArrayList();
	 
	 mylist.add(10);
	 mylist.add(12);
	 mylist.add("Manbir");
	 mylist.remove(2);
	 System.out.println(mylist instanceof ArrayList);
	  
	 if((mylist instanceof ArrayList)==true) //instanceof is a operator used to check if the object belongs to a particular class.
		 System.out.println("its an instance of class arraylist");
	 //System.out.println(mylist.get(2));

//     if(mylist.isEmpty()==false)
//     {
//    	 mylist.clear();
//     }
	 //System.out.println(mylist);
	 
	 mylist2.addAll(mylist);
	 System.out.println(mylist2);
	 
	 mylist.add(2,23);
	 System.out.println(mylist);


	 
	 
	 

	}

}
