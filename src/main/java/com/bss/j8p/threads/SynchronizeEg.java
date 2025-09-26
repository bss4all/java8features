package com.bss.j8p.threads;


class Counter {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}


public class SynchronizeEg {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
                try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        
        System.out.println("1-"+counter.getCount());

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        System.out.println("2-"+counter.getCount());
        t1.start();
        System.out.println("3-"+counter.getCount());
        t2.start();
        System.out.println("4-"+counter.getCount());

        t1.join();
        System.out.println("5-"+counter.getCount());
        t2.join();

        System.out.println("Final count: " + counter.getCount());


	}

}
