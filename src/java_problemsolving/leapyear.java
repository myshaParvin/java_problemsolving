package java_problemsolving;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		
		System.out.println("Enter the year_");
		int year= y.nextInt();
		
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println("Yay! It is a LEAP YEAR!");
		}
		else {
			System.out.println("Oh no! It is not a LEAP YEAR!");
		}
	}

}
