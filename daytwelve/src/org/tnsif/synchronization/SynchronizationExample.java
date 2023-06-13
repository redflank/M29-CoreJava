//Driver class
package org.tnsif.synchronization;




public class SynchronizationExample {

	public static void main(String[] args) {
		Power obj = new Power();
		ThreadOne obj1 = new ThreadOne(obj);
		ThreadTwo obj2 = new ThreadTwo(obj);
		obj1.start();
		obj2.start();
		
		
		

	}

}
