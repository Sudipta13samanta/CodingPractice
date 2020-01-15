package com.sudipta.practics.ds;

import java.util.LinkedList;
import java.util.List;

public class MyBlockingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 
class MyQueue{
	private int limit;
	private List<Object> queue = new LinkedList<>();
	
	public MyQueue(int limit) {
		this.limit = limit;
	}
	
	public synchronized void enqueue(Object obj) throws InterruptedException {
		
		while(this.queue.size() == this.limit) {
			wait();
		}
		
		if(this.queue.size() == 0) {
			notifyAll();
		}
		
		this.queue.add(obj);
	}
	
	public synchronized Object dequeue() throws InterruptedException {
		while(this.queue.size() == 0) {
			wait();
		}
		
		if(this.queue.size() == this.limit) {
			notifyAll();
		}
		
		return this.queue.remove(0);
	}
}