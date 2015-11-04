package com.epam.threads.joins;

import org.apache.log4j.Logger;

public class WorkingThread implements Runnable {
	final static Logger logger = Logger.getLogger(WorkingThread.class);	

	public void run() {
		Thread currentThread = Thread.currentThread();
		logger.info("Current Thread:" + currentThread.getName() + ", priority:"
				+ currentThread.getPriority() + ", isAlive:"
				+ currentThread.isAlive());
	}

}
