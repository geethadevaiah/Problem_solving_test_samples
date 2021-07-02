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
