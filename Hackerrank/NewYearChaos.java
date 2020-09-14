package Hackerrank;

public class NewYearChaos {
	public static void minimumBribes(int[] q) {
		int bribes = 0;
        /*for (int i = q.length - 1; i >= 0; i--) {
            if((q[i] - (i+1)) > 2){
                System.out.println("Too chaotic");
                return;
            }
            //can take from 0 also
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) bribes++;
        }
        System.out.println(bribes);*/
        
		
		//check this code
        for(int i = 0 ; i < q.length ; i++) {
        	if(q[i] - (i + 1) > 2) {
        		System.out.println("Too chaotic");
        		return ;
        	}
        	// can start from 0 as well
        	for(int j = q[i] - 2 ; j < i ; j++) {
        		if(q[j] > q[i]) 
        			bribes++;
        	}
        }
        System.out.println(bribes);
        
	}
}
