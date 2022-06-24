package com.project.decisionmaking;

public class IfelseStatement {
public static void main(String[] args) {
	int Balance=3000;
	int age=16;
	
	if(Balance>3000) {
		System.out.println("you are eligible for account opening");
	}
	else {
		System.out.println("sorry, you are not eligible for account opening");
	}
	if(age>=16) {
		System.out.println("eligible");
	}
	else {
		System.out.println("Sorry,not eligible");
	}
}

}