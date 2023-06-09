package org.tnsif.annotations;

class Car {
	public void speed(int speed) {
		System.out.println("Speed is: " + speed + "Km/hr");
	}
}

//child class
class Lamborghini extends Car {
	/*
	 * below annotation ensures that child class method is inheriting the properties
	 * of parent class method
	 */
	@Override
	// it should be speed(int speed)
	// if we do Speed(int speed) , then we will get an error
	public void speed(int speed) {
		System.out.println("Speed is: " + speed + "Km/hr");
	}
}

public class OverrideAnnotationExample {

	public static void main(String[] args) {
		Lamborghini s = new Lamborghini();
		s.speed(90);
	}
}
