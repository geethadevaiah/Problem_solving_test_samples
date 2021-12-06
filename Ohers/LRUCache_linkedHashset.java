package Ohers;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache_linkedHashset {

	int capacity;
	Set<Integer> cache ;
	
	public LRUCache_linkedHashset(int capacity) {
		this.capacity = capacity;
		cache = new LinkedHashSet<>();
	}
	
	public void refer(int page) {
		
		// check whether the set already contains the page
		if(!cache.contains(page)) {
			if(capacity == cache.size()) { // if size full remove the last el
				int firstel = cache.iterator().next();
				cache.remove(firstel);
			}
		}
		else {// even if it is there, remove the element
			cache.remove(page);
		}
		
		// add the element to the front
		cache.add(page);
	}
	
	public void display() {
		
		/// create a linkedlist out of the linkedhashset for the iterator
		
		LinkedList<Integer> list = new LinkedList<>(cache);
		Iterator<Integer> itr = list.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
	}
	
	public static void main(String[] args) {
		LRUCache_linkedHashset cache = new LRUCache_linkedHashset(4);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(1);
		cache.refer(4);
		cache.refer(5);
		cache.refer(2);
		cache.refer(2);
		cache.refer(1);
		cache.display();
	}
}
