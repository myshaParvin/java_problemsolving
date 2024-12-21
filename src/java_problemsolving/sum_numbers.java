package java_problemsolving;

import java.util.Scanner;

public class sum_numbers {
	
	//method that returns the sum of n natural numbers   
	static int naturalNumberSum(int n)   
	{   
	int sum = 0;   
	//executes until the condition becomes false  
	for (int i = 1; i <= n; i++)    
	//adding the value of i to the sum variable  
	sum = sum + i;   
	return sum;   
	}   

	public static void main(String[] args) {
		
		Scanner count= new Scanner(System.in);

		System.out.println("How many numbers you want to add?");
		int n= count.nextInt();
		
		System.out.println("The sum of the numbers: "+naturalNumberSum(n));
	}

}
