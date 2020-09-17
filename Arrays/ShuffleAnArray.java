package Arrays;

import java.util.Random;

public class ShuffleAnArray {
	private int[] array;
    private int[] original;
    
    Random rand = new Random();

    private void swapAt(int i , int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
        
    // constructor
    public ShuffleAnArray(int[] nums) {
        array = nums;
        original = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i = 0 ; i < array.length ; i++){
            swapAt(i, rand.nextInt(array.length));
        }
        return array;
    }
}
