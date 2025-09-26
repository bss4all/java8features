package com.bss.j8p.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> System.out.println("Runnable Running in thread: " + Thread.currentThread().getName());
        executor.execute(task);
        
        
        Runnable task1 = () -> System.out.println("Runnable Running in thread: " + Thread.currentThread().getName());
        executor.submit(task1);
        
        for (int i = 0; i<100;i++) {
        	task = () -> System.out.println("Runnable Running in thread: " + Thread.currentThread().getName());
            executor.execute(task);
        }

        
        Callable<String> callableTask = () -> {
            Thread.sleep(5000);
            System.out.println("Callable Running in thread: " + Thread.currentThread().getName());
            return "Callable Task completed";
        };

        Future<String> future = executor.submit(callableTask);

        Callable<String> callableTask1 = () -> {
            Thread.sleep(5000);
            System.out.println("Callable Running in thread: " + Thread.currentThread().getName());
            return "Callable Task completed";
        };
        
        Future<String> future1 = executor.submit(callableTask1);
        
        try {
            String result = future.get(); // Blocks until result is available
            System.out.println(result);
            result = future1.get(); // Blocks until result is available
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown(); // Graceful shutdown

	}
}
