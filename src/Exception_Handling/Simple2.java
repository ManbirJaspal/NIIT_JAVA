package Exception_Handling;
import java.lang.Throwable;
public class Simple2 {

	public static void main(String[] args) {
try{
	System.out.println(100/0);

}
catch(ArithmeticException e){		
//	e.printStackTrace();  ------> used to print name of exception, description and stack trace(location) 
//	System.out.println(e.getMessage());-----> used to print only description
	System.out.println(e.toString()); // used to print name of exception and description
	
}

	}
	

}
