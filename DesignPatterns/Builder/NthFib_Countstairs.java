package DesignPatterns.Builder;

public class NthFib_Countstairs {

	// A simple recursive program to find
    // n'th fibonacci number
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    // Returns number of ways to reach s'th stair
    static int no_waysToReachNStair(int s) {
        return fib(s + 1);
    }
	
	public static void main(String[] args) {
		System.out.println(no_waysToReachNStair(4));
	}
}
/**
*	Find a way to climb the n-th stairs when one can take either one stp or two steps at one time
*   
*	At 1st step, there is only one option to climb = 1
*   At second step, 2 options -> one step twice or two steps at once.
*
*   So at every step there is option to choose either previous option or last-to-second previous option
*   ways(n) = ways(n-1) + ways(n-2)
*   
*   this is nothing but fib ( n + 1 )
*   
*   Finding the n-th fibonacci number
*
***/
