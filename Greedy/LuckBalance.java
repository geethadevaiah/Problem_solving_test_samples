package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {
	static int luckBalance(int k, int[][] contests) {
		int luck = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < contests.length ; i++) {
			if(contests[i][1] == 0)
				luck += contests[i][0];
			else list.add(contests[i][0]);
		}
		
		Collections.sort(list, Collections.reverseOrder());
		for(int i = 0 ; i < list.size() ; i++) {
			if(k > 0) { 
				luck += list.get(i);k--;
			}
			else luck -= list.get(i);
		}
		return luck;
    }
	public static void main(String[] args) {
		int[][] in = {{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
		System.out.println(luckBalance(3, in));
		
	}
}
