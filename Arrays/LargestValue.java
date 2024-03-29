package Arrays;

class LargestValue{


/* Returns the largest value in an array of n nonnegative integers */
public static int intCompareToMax(int array[], int n){

    int curMax, i;
    /* Make sure that here is at least one element in the array. */
    if (n <= 0)
    return-1;
    /* Set the largest number so far to the first array value. */
    curMax = array[0];
    /* Compare every number with the largest number so far. */
    for (i = 1; i < n; i++) {
        if (array[i] > curMax) {
            curMax= array[i];
        }
    }
    return curMax;
}


/* Returns the largest value in an array of n nonnegative integers */
public static int  intCompareToAll(int array[], int n){
    int i, j;
    boolean isMax;
    /* Make sure that there is at least one element in the array. */
    if (n <= 0)
    return -1;
    for (i = 0; i < n; i++) {
        isMax = true;
        for (j = 0; j < n;j++) {
            /* See if any value is greater. */
            if (array[j] > array[i]) {
                isMax = false; 
                /* array[i] is not the largest value. */
                break;
            }
        }
        /*If isMax is true, no larger value exists; array[i] is max. */
        if(isMax) 
        break;
    }
    return array[i];
}
}