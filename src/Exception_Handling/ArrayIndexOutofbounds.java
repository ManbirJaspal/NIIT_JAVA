package Exception_Handling;
import java.util.Scanner;

public class ArrayIndexOutofbounds {

	public static void main(String[] args) {
		int a[]= new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elemnts");
		
		try{
				for(int i=0; i<=12; i++)
				{
					a[i]=sc.nextInt();
				}
				System.out.println("edaed");

				
		}
				
				catch(Exception e){
					System.out.println(" we got array index out of bounds");
					
				}
		}
	}
	


