package com.bjsxt.singleton;

import java.util.concurrent.CountDownLatch;



public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		long start = System.currentTimeMillis();
		int threadNum = 20;
		
		CountDownLatch  countDownLatch = new CountDownLatch(threadNum);

		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					for (int i = 0; i < 1000000; i++) {
						SingletonDemo1.getInstance();
					}
					countDownLatch.countDown();

				}
				
			}

			).start();
		}
		
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println(end-start);

	}

}
