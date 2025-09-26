package com.bss.j8p.threads;

import java.util.concurrent.Callable;

@SuppressWarnings("rawtypes")
public class MultipleThreadsRunEg implements Runnable, Callable {
	
	private String name;

	MultipleThreadsRunEg(String name){this.name=name;}

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new MultipleThreadsRunEg("Thread A"));
        Thread t2 = new Thread(new MultipleThreadsRunEg("Thread B"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        new MultipleThreadsRunEg("Call A").call();
        new MultipleThreadsRunEg("Call B").call();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
            System.out.println(name + " - Count: " + i);
            try { Thread.sleep(4000); } catch (InterruptedException e) {}
            System.out.println(name + " Done ");
        }		
	}

	@Override
	public Object call() {
		for (int i = 1; i <= 3; i++) {
            System.out.println(name + " - Count: " + i);
            try { Thread.sleep(4000); } catch (InterruptedException e) {}
            System.out.println(name + " Done ");
        }
		return name;
	}

}
