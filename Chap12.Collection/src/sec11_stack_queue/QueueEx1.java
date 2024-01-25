package sec11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		que.offer("one");
		que.offer("two");
		que.offer("three");
		
		while(!que.isEmpty()) {
			System.out.println(que.poll());
		}
		System.out.println("큐의 사이즈 : " + que.size());
	}

}
