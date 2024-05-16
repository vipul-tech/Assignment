package com.thread;

public class MessagePrintingThread extends Thread{
	private String msg;
	private PrintMessage pm;
	public MessagePrintingThread() {
		super();
	}
	public MessagePrintingThread(String msg, PrintMessage pm) {
		super();
		this.msg = msg;
		this.pm = pm;
	}
	public void run() {
		pm.print(msg);
	}
}
