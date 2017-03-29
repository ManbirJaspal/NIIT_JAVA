package Exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple {                                 // used to solve unexpected events(exceptions)

	public static void main(String[] args) {
		int a;
        System.out.println("Enter a number");
		
		try
		{Scanner sc= new Scanner(System.in);
			a = sc.nextInt();
			System.out.println(a);

		}
		catch(InputMismatchException e)
		{
			Scanner sc= new Scanner(System.in);
					System.out.println("Please enter a number again");
					a=sc.nextInt();
					System.out.println(a);
					
				}
		

	}

}
