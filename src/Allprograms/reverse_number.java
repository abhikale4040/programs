package Allprograms;

import java.util.Scanner;

public class reverse_number {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number::");
		int num =sc.nextInt();
		
		int rev=0,rem;
		while(num!=0) {
			rem=num%10; 
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse is "+rev );
	}

}
