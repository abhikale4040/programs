package Allprograms;

import java.util.Scanner;

public class Amstrong_number {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int t1=num;
	int length=0;
	while(t1!=0) {
		t1= t1/10;
		length =length+1;	
				}
	int t2=num;
	int arm=0;
	int rem;
	while(t2!=0) {
		int mul=1;
		rem=t2%10;
		for(int i=1;i<=length;i++) {
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10;
	}
	if(arm==num) {
		System.out.println(num+" is a amstrong number");
	}else {
		System.out.println(num+" is not a amstrong number");
	}
	
	
	
	
	
}
}
