package Ohers;

public class MinStack {

	private Node head;
    
    public void push(int x) {
        if (head == null) 
            head = new Node(x, x, null);
        else 
            head = new Node(x, Math.min(x, head.min), head);
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
        
    private class Node {
        int val;
        int min;
        Node next;
            
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
    
    public static void main(String[] args) {
		MinStack mins = new MinStack();
		mins.push(0);
		mins.push(1);
		mins.push(-1);
		System.out.println(mins.getMin());
		mins.pop();
		System.out.println(mins.top());
		System.out.println(mins.getMin());
	}
}
