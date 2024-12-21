package java_problemsolving;

import java.util.Scanner;

public class evenodd {
	
	public static void even_odd(int number){
		if(number%2==0) {
			System.out.println("It is a EVEN number!");
		}
		else {
			System.out.println("It is a ODD number!");
		}
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		System.out.println("Enter Number_");
		int number= input.nextInt();
		
		even_odd(number);
	}

}
