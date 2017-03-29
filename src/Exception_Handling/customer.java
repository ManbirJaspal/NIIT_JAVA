package Exception_Handling;
public class customer {    //this program is to show that static variable  is used for only one copy for the
	                       // all the objects of the class. Static variables are accessed through constructor.
	
	static int id=0;
	String name;

	customer()
	{  
		id++;
		
	}

	public static void main(String[] args) {
		
		
		
		customer obj1=new customer();
		obj1.name="hh";
		System.out.println(obj1.id);
		
		customer obj2=new customer();
		obj2.name="hw";
		System.out.println(obj2.id);
		
		customer obj3=new customer();

		obj3.name="ww";
		System.out.println(obj3.id);
		
		
	

	}

}
