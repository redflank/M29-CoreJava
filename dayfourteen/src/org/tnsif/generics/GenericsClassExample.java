//program to demonstrate on Generics class
package org.tnsif.generics;
//generics class
class GenericClass<T> {
	
	T x;
	void print(T x)
	{
		this.x=x;
	}
	T accept()
	{
		return x;
		
	}
}
//driver class
public class GenericsClassExample
{
	public static void main(String[] args) {
		GenericClass<String>obj=new GenericClass<>();
		obj.print("Pratik");
		System.out.println(obj.accept());
	}

}