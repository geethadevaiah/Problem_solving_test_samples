package Test_trials;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


class stack_q {
	
	private int[] values;
	
	private Deque<Integer> deque;
	
	private Integer last ;
	
	
	public stack_q() {
		deque = new 
		last = 0;
	}
	// push
	public void push(Integer val) {
		
		deque.addLast(val);
		last = val;
		
	}
	
	
	//pop
	public Integer pop() {
		if(last == 0) {
			return -1;
		}
		
		Integer return_val = deque.getLast();
		deque.removeLast();
		
		return return_val;
		
	}
	
	//peek
	public Integer peek() {
		if(last == 0) {
			return -1;
		}
		
		return deque.getLast();
	}
	
	
	
}



public class Stack_Queue {

	public static void main(String[] args) {
		
		/*Queue queue = new DelayQueue<>();
		queue.add(1);*/
		
		stack_q s = new stack_q();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(3);
		
		list.stream().filter(i -> i%2 ==0).forEach(System.out::print);
		
	}
	
	

}
