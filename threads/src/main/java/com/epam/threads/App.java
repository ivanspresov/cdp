package com.epam.threads;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	final static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		logger.info("Start main thread");
		Thread currentThread = Thread.currentThread();
		logger.info("Current Thread Name=" + currentThread.getName());
		logger.info("Current Thread Priority=" + currentThread.getPriority());
		logger.info("Current Thread Alive=" + currentThread.isAlive());
		Thread thread = new Thread(new WorkingThread());
		logger.info("Start working thread");
		thread.start();
	}
}
