//Program to Demonstrate Bitwise Operator

package org.tnsif.operatordemo;

public class BitwiseOperatorProgram {

	public static void main(String[] args) {
		int result1 = 10&7;//Bitwise AND
		int result2 = 10|7;//Bitwise inclusive OR
		int result3 = 10^7;//Bitwise exclusive OR
		//Shift Operator
		int result4 = 8>>2;//right shift
		int result5 = 8<<1;//left shift
		System.out.println(result1);//2
		System.out.println(result2);//15
		System.out.println(result3);//13
		System.out.println(result4);//2
		System.out.println(result5);//16

	}

}
