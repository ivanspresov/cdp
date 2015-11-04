package com.epam.threads.joins;

import org.apache.log4j.Logger;

public class JoinMain {
	final static Logger logger = Logger.getLogger(JoinMain.class);

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("Main Join Thread");
		logger.info("Current thread:" + currentThread.getName());
		Thread thread = new Thread(new WorkingThread(), "Joined Thread");
		thread.start();
		try {
			//join main thread to working thread and waiting while working thread finishes its work.
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		currentThread = Thread.currentThread();
		logger.info("Finishing the "+currentThread.getName()+" work");
	}
}
