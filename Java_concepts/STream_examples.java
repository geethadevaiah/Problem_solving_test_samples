package Java_concepts;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class STream_examples {
public static void main(String[] args) {
	List<Integer> list  = Arrays.asList(10,15,8,49,25,98,32,10);
	
	//list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
	//list.stream().map(x -> String.valueOf(x)).filter(x -> x.startsWith("1")).forEach(System.out::println);
	//Set<Integer> set = new HashSet<>();
	//list.stream().filter(x -> !set.add(x)).forEach(System.out::println);
	list.stream().filter(x -> Collections.frequency(list, x) == 1).forEach(System.out::println);
	//list.stream().findFirst().ifPresent(System.out::println);
	
//	System.out.println(list.stream().max((x,y)->  x.compareTo(y)).get());
//	System.out.println(list.stream().peek(System.out::println).max(Integer::compare).get());
	
	 String input = "Java Hungry Blog Alive is Awesome";
	 // first non-repeated character in it using Stream functions?
//	 System.out.println(input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
//	 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//	 .entrySet().stream().filter(x -> x.getValue() == 1L)
//	 .map(x -> x.getKey()).findFirst().get());
	 
	 //print duplicate chars from string
	 input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
	 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	 .entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).forEach(System.out::println);
	 
	 
	 //the first repeated character in it using Stream functions?
//	 System.out.println(input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
//			 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//			 .entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).findFirst().get());
//	 
//	 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//	 myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
}
}
