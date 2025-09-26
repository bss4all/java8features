package com.bss.j8p.threads;

class Counter1 {
	private int count = 0;
 	public void increment() {
    	count++;
	}
 	public int getCount() {
    	return count;
	}
}
 public class Main {
	public static void main(String[] args) {
    	Counter1 counter = new Counter1();
    	Thread t1 = new Thread(() -> {
        	for (int i = 0; i < 1000; i++) {
            	counter.increment();
        	}
    	});
     	Thread t2 = new Thread(() -> {
        	for (int i = 0; i < 1000; i++) {
            	counter.increment();
        	}
    	});
     	t1.start();
    	t2.start();
     	System.out.println("Counter: " + counter.getCount());
	}
}