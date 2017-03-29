package Exception_Handling;
import java.util.Scanner;
public class nullpointerExceptions {          //the exception occurs when the value of a variable is null

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//String a= "manbir";
			//System.out.println(a.length());
		
		String name1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your first name");
		name1 = sc.nextLine();
		String name2 = null;
		
		try{
			System.out.println("name 2 contains# of letters " +name2.length());

		}
		
		catch(NullPointerException e){
			
			Scanner sc1= new Scanner(System.in);
			System.out.println("Enter your first name2");
			name2= sc1.next();
			System.out.println("name 2 contains# of letters " +name2.length());

		}
		


		
	
	}
	

}
