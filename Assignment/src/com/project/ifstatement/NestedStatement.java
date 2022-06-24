package com.project.ifstatement;

public class NestedStatement {
public static void main(String[] args) {
	String Name="Kavya";
	int Class=1;
	int age=8;
	Long phonenumber=9606643321L;
	
	if(age>=8) {
		System.out.println("eligible");
		
	}
	
	else {
		System.out.println("not eligible");
	}
	
	if(Class==2) {
		System.out.println("Eligible");
	}
	else {
		System.out.println("error");
	}
	
	if(Name != null & !Name.isBlank() ) {
		System.out.println("Name is VALID");
	}
	
	else {
		System.out.println("Name invalid....");
	}
	if(phonenumber>0) {
		System.out.println("Contact Number is Valid");
	}
	else {
		System.out.println("not valid");
	}
	
}
}
