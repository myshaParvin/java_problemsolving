package java_problemsolving;

import java.util.Scanner;

public class greatestnumber {

	public static void main(String[] args) {
		Scanner input1= new Scanner(System.in);

		System.out.println("Enter First Number_");
		int first_num= input1.nextInt();
		
		Scanner input2= new Scanner(System.in);

		System.out.println("Enter Second Number_");
		int second_num= input2.nextInt();

		Scanner input3= new Scanner(System.in);

		System.out.println("Enter Third Number_");
		int third_num= input3.nextInt();
		
		if(first_num>second_num) {
			if(first_num>third_num){
				System.out.println("First number is the greatest number here which is : "+first_num);
			}else {
				System.out.println("Third number is the greatest number here which is : "+third_num);
			}
		}
			
		else {
			if(second_num>third_num) {
				System.out.println("Second number is the greatest number here which is : "+second_num);
			}
			else {
				System.out.println("Third number is the greatest number here which is : "+third_num);
			}
	}

	}
}
