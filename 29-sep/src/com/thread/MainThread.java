package com.thread;

public class MainThread {
	public static void main(String args[]) {
		LoopThread th = new LoopThread();
		th.start();
		for(int i = 0; i < 100; i++) {
			System.out.println("Main Thread : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
