package Ohers;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return countOnes(x ^ y);
    }
    public int countOnes(int number){
        int count = 0;
        while(number != 0){
            number = number & (number-1);
            count++;
        }
        return count;
    }
}
