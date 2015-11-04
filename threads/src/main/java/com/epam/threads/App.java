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
		//playing with minimal priority for main thread
		currentThread.setPriority(Thread.MIN_PRIORITY);
		currentThread.setName("Main Thread");
		logger.info("Current Thread Name=" + currentThread.getName());
		logger.info("Current Thread Priority=" + currentThread.getPriority());
		logger.info("Current Thread Alive=" + currentThread.isAlive());
		Thread thread = new Thread(new WorkingThread(),"Working Thread");
		//playing with maximum priority for working thread
		thread.setPriority(Thread.MAX_PRIORITY);
		logger.info("Start working thread");
		thread.start();
		//WrapperRunnableThread - medium priority
		new WrapperRunnableThread();
		currentThread = Thread.currentThread();
		logger.info(currentThread);
	}
}
