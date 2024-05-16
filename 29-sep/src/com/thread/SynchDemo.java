package com.thread;

public class SynchDemo {
	public static void main(String args[]) {
		PrintMessage pm = new PrintMessage();
		MessagePrintingThread x = new MessagePrintingThread("Hello",pm);
		MessagePrintingThread y = new MessagePrintingThread("World",pm);
		x.start();
		y.start();
	}
}
