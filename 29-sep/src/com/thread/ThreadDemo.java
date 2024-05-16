package com.thread;

public class ThreadDemo implements Runnable{

	public static void main(String[] args) {
		new Thread(new ThreadDemo()).start();
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}