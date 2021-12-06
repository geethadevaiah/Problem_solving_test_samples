package Java_concepts;

import java.util.Optional;

public class OptionalEx {

	
	public static void main(String[] args) {
		
		String[] str = new String[5];
		  
        // Setting value for 2nd index
        str[2] = "my name is this that";
  
        // It returns an empty instance of Optional class
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
  
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
        
		
	}
}
