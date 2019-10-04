package com.sapient.threading;


public class RunnableDemo {
	public static void main(String[] args) {
		
		System.out.println("Thread running is : " + Thread.currentThread().getName());
		Thread t1 = new Thread(new RunnableImpl());
		t1.start();
		System.out.println("Thread running is : " + t1.getName());
	}
}
	class RunnableImpl implements Runnable {
		
		@Override
		public void run() {
			System.out.println("Thread is executing");
		}
	}
//}
