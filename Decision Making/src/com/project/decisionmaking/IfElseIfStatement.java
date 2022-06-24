package com.project.decisionmaking;

public class IfElseIfStatement {
public static void main(String[] args) {
	boolean HaveAdharcard=false;
	boolean HavePancard=false;
	
	if(HaveAdharcard) {
				System.out.println("eligible for A/C Opening");
			}
	else if(HavePancard) {
		System.out.println("eligible for A/C Opening");
	
	}
	else {
		System.out.println("not eligible");
	}
}
}
