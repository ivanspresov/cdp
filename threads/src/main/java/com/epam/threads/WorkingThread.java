package com.epam.threads;

import org.apache.log4j.Logger;

public class WorkingThread implements Runnable {
	final static Logger logger = Logger.getLogger(WorkingThread.class);

	public void run() {
		Thread thread = Thread.currentThread();
		logger.info("Current Thread Name=" + thread.getName());
		logger.info("Current Thread Priority=" + thread.getPriority());
		logger.info("Current Thread Alive=" + thread.isAlive());
	}

}
