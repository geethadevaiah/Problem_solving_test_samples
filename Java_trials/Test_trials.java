package Java_trials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test_trials {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		for(int i = 1 ; i <= 10 ; i++) {
			l1.add(i);
		}
		//give the filtered list of even numbers
		System.out.println(l1.stream().filter(i -> i % 2 ==0).collect(Collectors.toList()));
		
		long count = l1.stream().filter(i -> i % 2 == 0 ).count();
		System.out.println("Count  :: "+count);
		
		// Comparator predicate
		Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);
		
		List<Integer> l2 = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println("l2 ? "+l2);
		
		// to get the max element
		Integer max = l1.stream().max(comp).get();
		System.out.println("Max : "+max);
		
		Integer min = l1.stream().min(comp).get();
		System.out.println("Min : "+min);
	
		l1.stream().forEach(i -> System.out.print(i+" "));
		
		// Map 
		
		List<String> l3 = new ArrayList<>();
		l3.add("mfsjdf");
		l3.add("fsdf");
		System.out.println(l3.stream().map(i -> i.toUpperCase()).collect(Collectors.toList()));
	}
}
