package java_problemsolving;

import java.util.Scanner;

public class pos_negnumber {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);

		System.out.println("Enter any Number_");
		int number= num.nextInt();
		
		if(number<0) {
			System.out.println("It is a Negative Number!");
		}else {
			System.out.println("It is a Positive Number!");
		}
		
		
	}

}
