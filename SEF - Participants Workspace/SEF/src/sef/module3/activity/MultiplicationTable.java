
package sef.module3.activity;


public class MultiplicationTable {


	public static void main(String[] args) {

		// Table from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("*** Table of "+i + " ***");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "X" + j +" = " + i*j);
			}
		}
		for (int i = 11; i <=20; i++) {
			System.out.println("*** Table of "+i+ " ***");
			for (int j = 1; j <=10; j++) {
				System.out.println(i + "X" + j +" = " +i*j);
			}
		}
	}
}
		

