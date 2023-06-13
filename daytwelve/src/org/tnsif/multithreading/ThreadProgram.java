/*Program to  demonstrate in 
 * creating a thread by extending a thread class*/
package org.tnsif.multithreading;

public class ThreadProgram extends Thread{
	
		public void run() {
			System.out.println("Thread is in running state");
		}
	
	
	
	public static void main(String[] args) {
		
		//ThreadProgram.run() 
		ThreadProgram t = new ThreadProgram();
		t.start();
		/*if the thread is in the running and starting state, 
		 * we can't start again*/
		}

}
