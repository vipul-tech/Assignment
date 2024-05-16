package com.thread;

public class LoopThread extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Loop Thread : "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
