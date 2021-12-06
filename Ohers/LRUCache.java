package Ohers;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LRUCache {
 
	// store keys of cache
	private Deque<Integer> doublyQueue;
	
	// store references of key in cache
	private HashSet<Integer> hashSet; 
	
	//maximum capacity of cache
	private final int CACHE_SIZE;
	
	public LRUCache(int capacity) {
		doublyQueue = new LinkedList<Integer>();
		hashSet = new HashSet<>();
		CACHE_SIZE = capacity;
	}
	
	// get page call
	public void refer(int page) {
		// check whether the hashset already has the page
		if(!hashSet.contains(page)) {  // no
			// check whether the queue is already full
			if(doublyQueue.size() == CACHE_SIZE) {
				// then remove the last item from the queue
				int last = doublyQueue.removeLast();
				// remove from hashset also
				hashSet.remove(last);
			}
		}
		// if found in the queue, remove it and place at the front
		else {
			doublyQueue.remove(page);
		}
		doublyQueue.addFirst(page); // addfirst or push
		hashSet.add(page);
	}
	
	// display
	public void display() {
		Iterator<Integer> itr = doublyQueue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
	}
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(4);
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
