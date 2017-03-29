package Collections;
import java.util.PriorityQueue; //the elements of the queue will be automatically sorted using PriorityQueue

public class PriotityQ {

	public static void main(String[] args) {

		PriorityQueue myPQ= new PriorityQueue();
		
	//myPQ.add("name");
		//myPQ.add("heera");
	//	myPQ.add("Sunny");
	myPQ.add(100);
		myPQ.add(200);
		myPQ.add(300);
		myPQ.offer(12);
		myPQ.offer(13); //offer is used for fifo
		myPQ.offer(10);

		
		System.out.println(myPQ.poll());
	}

}
