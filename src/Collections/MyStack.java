package Collections;
import java.util.Stack;
public class MyStack {

	public static void main(String[] args) {

		Stack mystack= new Stack();
		
		mystack.push(12);
		mystack.push("manbir");
		mystack.push(23);
//		System.out.println(mystack.peek());
		System.out.println(mystack);
		
		mystack.pop(); //starts removing element from the top of stack
		System.out.println(mystack);


		
	}

}
