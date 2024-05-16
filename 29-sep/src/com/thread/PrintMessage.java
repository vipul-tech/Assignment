package com.thread;

public class PrintMessage {
	synchronized public void print(String msg) {
		System.out.print("[");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(msg+"]");
	}
}
