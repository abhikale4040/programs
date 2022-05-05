package Allprograms;

import java.util.Scanner;

public class Fibonnaci_Series {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number::");
		int num= sc.nextInt();
		
	int a=0,b=1,c;
	
	for(int i=0;i<=num-1;i++) {
		c=a+b;
		System.out.println(c);
		
		a=b;
		b=c;
	}
		
		
		
		
		
		
		
	}

}
