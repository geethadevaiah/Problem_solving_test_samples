package Recursion;

public class calculatePower {
	public double myPow(double x, int n) {
	        if(n == 0 )
	            return 1;
	        if(n == 1 ) return x;
	        if(n < 0) myPower(1/x , n); 
	        return myPower(x, n);
	    }
	    public double myPower(double x , int n){
	        return Math.pow(x, n);
	    }
}
