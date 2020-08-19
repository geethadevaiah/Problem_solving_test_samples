/* Returnsthe largest value in an array of n nonnegative integers */
intCompareToMax(int array[], int n){

    int curMax, i;
    /* Make sure thatthere is at least one element in the array. */
    if (n <= 0)
    return-1;
    /* Set the largest number so far to the first array value. */
    curMax = array[0];
    /* Compare every number with the largest numberso far. */
    for (i = 1; i < n; i++) {
        if (array[i] > curMax) {
            curMax= array[i];
        }
    }
    return curMax;
}


/* Returns thelargest value in an array of n nonnegative integers */
intCompareToAll(int array[], int n){
    int i, j;
    bool isMax;
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