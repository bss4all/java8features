package com.bss.j8p.jsp.threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RequestSimulator {

	public static void main(String[] args) {

		int N = 20; // total requests
        int T = 5;  // time limit in seconds
        int X = 5;  // number of users (threads)
        
        ExecutorService executor = Executors.newFixedThreadPool(X);
     
        CountDownLatch latch = new CountDownLatch(N);
        
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < N; i++) {
        	System.out.println("Submitting request " + (i + 1));
            executor.submit(() -> {
                try {
                    Thread.sleep(1000); // simulate 1-second request
                    System.out.println(" Request completed by " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    latch.countDown();
                }
            });
        }
        
        executor.shutdown();
        
		try {
			if (!latch.await(T, TimeUnit.SECONDS)) {
				System.out.println("Not all requests completed within the time limit.");
			} else {
				System.out.println("All requests completed within the time limit.");
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("Total time: " + (endTime - startTime) + " ms");
		
	}

}
