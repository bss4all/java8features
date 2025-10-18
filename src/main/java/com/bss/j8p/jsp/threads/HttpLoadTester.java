package com.bss.j8p.jsp.threads;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HttpLoadTester {

	public static void main(String[] args) {
		int N = 20; // total requests
        int T = 5;  // time limit in seconds
        int X = 5;  // number of users (threads)
        String targetUrl = "http://localhost:8080/api/test"; // your endpoint

        ExecutorService executor = Executors.newFixedThreadPool(X);
        CountDownLatch latch = new CountDownLatch(N);
        HttpClient client = HttpClient.newHttpClient();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            executor.submit(() -> {
                try {
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(targetUrl))
                            .GET()
                            .build();

                    HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                    System.out.println("Response: " + response.statusCode());
                } catch (Exception e) {
                    System.err.println("Request failed: " + e.getMessage());
                } finally {
                    latch.countDown();
                }
            });
        }

        executor.shutdown();
        boolean completed = false;
		try {
			completed = latch.await(T, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        long elapsed = (System.currentTimeMillis() - startTime) / 1000;

        if (completed) {
            System.out.println("✅ All " + N + " requests completed in " + elapsed + " seconds.");
        } else {
            System.err.println("❌ ERROR: Not all requests completed within " + T + " seconds.");
        }
	}

}
