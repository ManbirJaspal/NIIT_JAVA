
package Exception_Handling;
public class RuntimeStackframe {

	public static void main(String[] args) {
        display();
        System.out.println("i am in main method");
        System.out.println("Ending main method");

	}

	private static void display() throws ArithmeticException //use of throw keyword to generate particular exception type( we add this when we what error might occur).
	                                                          // it is used less because it has no solution.
	{
        System.out.println("i am in display method");
        System.out.println(100/0);
//        try{
//        	System.out.println(100/0);
//        
//        }
//        
//        catch(ArithmeticException e){
//        	System.out.println(100/10);
//        }
        myprint();

        System.out.println("Ending display method");
		
	}

	private static void myprint() {
        System.out.println("i am in myprint method");
       
        System.out.println("Ending myprint method");


		// TODO Auto-generated method stub
		
	}

}
