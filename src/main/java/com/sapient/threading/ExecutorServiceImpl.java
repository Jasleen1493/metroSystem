package com.sapient.threading;

import java.util.concurrent.*;

public class ExecutorServiceImpl {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		ExecutorService executorService2 = Executors.newFixedThreadPool(10);
		
		Future future = executorService1.submit(new Runnable() {
			@Override
			public void run() {
			
			}
		});
		System.out.println(future.get());
		
		Future future1 = executorService1.submit(new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				return null;
			}
		});
		System.out.println(future.get());
	executorService1.shutdown();
	}
}
