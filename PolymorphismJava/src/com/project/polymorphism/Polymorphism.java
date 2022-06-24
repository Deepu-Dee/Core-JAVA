package com.project.polymorphism;

public class Polymorphism {
	
	/* Method OverLoading*/ 
	
	public void Whatsup(String ProfileName) {
		System.out.println("Profile Name= "+ProfileName);
	}
	public void Whatsup(long PhoneNumber) {
		System.out.println("Phone Number= "+PhoneNumber);
		
	}
	public void Whatsup(boolean ProfilePhoto) {
		System.out.println("Profile Photo= "+ProfilePhoto);
	}
	public void Whatsup(int UserId) {
		System.out.println("User Id= "+UserId);
	}
	
}
