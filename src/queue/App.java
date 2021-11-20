package queue;

import java.util.LinkedList;
import java.util.Queue;

public class App {
	
	public static void main(String[] args) {
		
		//We process the items in a FIFO manner
		
		Queue<Integer> queue = new LinkedList<>();
		
		//add() method insert a new item into the queue in O(1)
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		//element() we can return without removing the first item
	//	System.out.println(queue.element());
		
		System.out.println(queue.size());
		
		while(!queue.isEmpty())
			System.out.println(queue.remove());
		
	}

}
