package IntrvwQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StreamExamples {

	/**
	 * this is to demonstrate and understand the usages of streams
	 */

	
	static class Employee {
		
		String name;
		int id;
		Map<String, Integer> score;
		public Employee(String name, int id, Map<String, Integer> score) {
			super();
			this.name = name;
			this.id = id;
			this.score = score;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", score=" + score + "]";
		}
		public Map<String, Integer> getScore() {
			return score;
		}
		public void setScore(Map<String, Integer> score) {
			this.score = score;
		}
	}
	
	public static void main(String[] args) {
		
		Map<String,Integer> s1 = new HashMap<String, Integer>();
		s1.put("English", 60);
		s1.put("kannada", 70);
		Map<String,Integer> s2 = new HashMap<String, Integer>();
		s2.put("Spanish", 70);
		s2.put("French", 80);
		Employee emp1 = new Employee("name1", 20, s1);
		Employee emp2 = new Employee("name2", 25, s2);
		
		List<Employee> list = new ArrayList<StreamExamples.Employee>();
		list.add(emp2);
		list.add(emp1);
		
//		System.out.println(list.stream().filter(e -> e.id > 22).collect(Collectors.toList()));
		
		list.stream().filter(x -> x.getScore().values().stream().mapToInt(Integer::intValue).average().getAsDouble() > 70)
			.forEach(x -> System.out.println(x.name));
		
//		list.stream().map(x -> x.getScore().values().stream().mapToInt(Integer::intValue).average()).forEach(System.out::print);
		
	}
}
