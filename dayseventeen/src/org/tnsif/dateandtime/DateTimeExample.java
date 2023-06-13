package org.tnsif.dateandtime;

import java.time.Clock;

public class DateTimeExample {

	public static void main(String[] args) {
		Clock c = Clock.systemUTC();
		System.out.println(c);

		Clock s = Clock.systemDefaultZone();
		System.out.println(s);
	}

}
