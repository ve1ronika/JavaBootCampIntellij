/**
 * 
 */
package activity;


public class AddWholeNum {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 1; i <= 50; i++) {
			total = total + i;
		}
		System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);
		
		int total1 = 50;
		for (int i= 51; i <=100; i++) {
			total1 = total1 + i;
		}
		System.out.println("Addition of Whole Numbers from 50 to 100 = " + total1);
	}
}


