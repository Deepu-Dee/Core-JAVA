package com.project.ifstatement;

public class IfElseIfstatement {
public static void main(String[] args) {
	int age=25;
	if(age<=0) {
		System.out.println("error");
	}
	else if(age<=10) {
		System.out.println("Too young");
	}
	else if(age<100) {
		System.out.println("Adult");
	}
	else {
		System.out.println("Older");
	}
//	int Marks=100;
//	boolean LateralEntry=true;
//	
//	if(Marks<100)
//	{
//		System.out.println("Not Eligible");
//	}
//	else if(LateralEntry)
//	{
//		System.out.println("Eligible");
//		
//	}
//	else {
//		System.out.println("data error");
//	}
}
}
