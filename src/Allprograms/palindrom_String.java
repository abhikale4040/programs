package Allprograms;

import java.util.Scanner;

public class palindrom_String {
	
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String::");
	String str =sc.next();
	
	String abc=str;
	String rev="";
	int len=str.length();
	for(int i =len-1;i>=0;i--) {
		
		rev= rev +str.charAt(i);
	}
	if(abc.equals(rev)) {
		System.out.println("The String is palindrome");
	}else {
		System.out.println("The String is not palindrome");
	}
	
	
	
	
	
}
}
