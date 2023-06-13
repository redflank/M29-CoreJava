//Program to demonstrate on Thread life-cycle
package org.tnsif.multithreading;

public class ThreadLifecycleExample extends Thread {

	public void run() {
		System.out.println("Is thread alive? " + this.isAlive());
		int x = 0;
		while (x < 3) {
			x++;
			System.out.println("x is: " +x);
		}
		try {
			sleep(500);
			System.out.println("Is thread alive or in sleep state: " + this.isAlive());
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted...");
		}
	}

	public static void main(String[] args) {
		ThreadLifecycleExample t = new ThreadLifecycleExample();
		System.out.println("Is thread alive or not: " +t.isAlive());
		t.start();
	}

}
