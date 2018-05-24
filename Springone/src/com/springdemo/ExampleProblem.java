package com.springdemo;

import java.util.Scanner;

public class ExampleProblem {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);  
	     
		   System.out.println("Enter your first string");  
		   String firststring=sc.next();  
		   System.out.println("Enter your name");  
		   String secondstring=sc.next(); 
		   int l1=firststring.length();
		   int l2=secondstring.length();
for(int i=0;i<=l1;i++) {
	char first=firststring.charAt(i);
	for(int j=0;j<=l2;j++) {
		char second	=secondstring.charAt(j);
			
			if(first==second) {
				System.out.println(first);
			}
	}
}
	}

}
